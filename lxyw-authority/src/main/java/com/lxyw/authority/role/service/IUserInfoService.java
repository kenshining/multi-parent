package com.lxyw.authority.role.service;

import com.lxyw.authority.AbstractSurpport.BaseMsgEntity;
import com.lxyw.authority.AbstractSurpport.IBaseService;
import com.lxyw.authority.entity.UserInfo;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-01-23
 */
public interface IUserInfoService extends IBaseService<UserInfo> {

    /**
     * 创建新用户
     * @param userInfo 新用户对象
     * @param pin 操作人工号
     */
    public int createNewUser(UserInfo userInfo,String pin);

    /**
     * 创建新用户
     * @param userInfo 更新户对象
     * @param pin 操作人工号
     */
    public int updateUser(UserInfo userInfo,String pin);

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public BaseMsgEntity<UserInfo> login(String userName, String password);
}
