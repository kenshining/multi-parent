package com.lxyw.authority.role.service;

import com.lxyw.authority.LxywAuthorityApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenServiceTests extends LxywAuthorityApplicationTests {

    @Autowired
    TokenService tokenService;

    @Test
    public void createAccessTokenTest(){

       String token = tokenService.createAccessToken("USER");
       Assert.assertNotEquals(null,token);
       logger.info(token);
    }

}
