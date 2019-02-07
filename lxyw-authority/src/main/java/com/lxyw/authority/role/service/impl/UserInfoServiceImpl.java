package com.lxyw.authority.role.service.impl;

import com.lxyw.authority.entity.UserInfo;
import com.lxyw.authority.mapper.UserInfoMapper;
import com.lxyw.authority.role.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

}
