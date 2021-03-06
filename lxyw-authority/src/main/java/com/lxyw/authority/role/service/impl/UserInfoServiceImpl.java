package com.lxyw.authority.role.service.impl;

import com.lxyw.authority.AbstractSurpport.BaseMsgEntity;
import com.lxyw.authority.entity.UserInfo;
import com.lxyw.authority.mapper.UserInfoMapper;
import com.lxyw.authority.role.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    /**
     * 创建新用户
     * @param userInfo 新用户对象
     */
    public int createNewUser(UserInfo userInfo,String pin){
        String id = UUID.randomUUID().toString().replace("-", "");
        //创建设置必要属性
        userInfo.setId(id);
        userInfo.setCreateBy(pin);
        userInfo.setCreateDate(new Date());
        return userInfoMapper.insert(userInfo);
    }

    /**
     * 创建新用户
     * @param userInfo 更新户对象
     * @param pin 操作人工号
     */
    public int updateUser(UserInfo userInfo,String pin){
        userInfo.setUpdateBy(pin);
        userInfo.setUpdateDate(new Date());
        return userInfoMapper.updateByPrimaryKey(userInfo);
    }

    /**
     * 登录调用
     * @param userName 证件号
     * @param password 密码
     * @return
     */
    public BaseMsgEntity<UserInfo> login(String userName, String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(userName);
        //设置返回信息
        BaseMsgEntity<UserInfo> result = new BaseMsgEntity<UserInfo>();
        List<UserInfo> users = userInfoMapper.select(userInfo);
        if(users == null || users.size() < 1){
            //用户信息不存在
            result.setHandleTime(new Date());
            result.setCode("101");
            result.setMsg("User infomation no found.");
            result.setStatus(false);
            return result;
        }
        //取用户信息
        userInfo = users.get(0);
        if(!userInfo.getPassword().trim().equals(password)){
            //用户信息不存在
            result.setHandleTime(new Date());
            result.setCode("102");
            result.setMsg("Wrong user password.");
            result.setStatus(false);
            return result;
        }else{
            result.setHandleTime(new Date());
            result.setCode("0");
            result.setMsg("Login successful.");
            result.setStatus(true);
            result.setResultEntity(userInfo);
            return result;
        }

    }

}
