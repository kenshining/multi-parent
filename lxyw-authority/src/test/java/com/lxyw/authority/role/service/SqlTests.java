package com.lxyw.authority.role.service;

import com.lxyw.authority.LxywAuthorityApplicationTests;
import com.lxyw.authority.entity.UserInfo;
import com.lxyw.authority.mapper.UserInfoMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SqlTests extends LxywAuthorityApplicationTests {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    public void selectTest(){
        UserInfo user = userInfoMapper.selectByPrimaryKey("uiouiiosufiodsuifouiofusofdsa");
        logger.info(user.toString());
    }
}
