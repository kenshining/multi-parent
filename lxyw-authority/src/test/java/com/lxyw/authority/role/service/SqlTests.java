package com.lxyw.authority.role.service;

import com.lxyw.authority.LxywAuthorityApplicationTests;
import com.lxyw.authority.entity.UserInfo;
import com.lxyw.authority.mapper.UserInfoMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.UUID;

public class SqlTests extends LxywAuthorityApplicationTests {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Before
    public void prepareDatas(){
        UserInfo user = new UserInfo();
        user.setId(UUID.randomUUID().toString().toUpperCase());
        user.setEmail("kencheng@foxmail.com");
        user.setUsername("kencheng");
        user.setMobile("18611699091");
        user.setStuffNo("0001");
        user.setPassword("passwords");
        userInfoMapper.insert(user);
    }

    @Test
    public void selectTest() throws Exception{
        List<UserInfo> users = userInfoMapper.selectAll();
       logger.info(users.get(0).getUsername());

    }
}
