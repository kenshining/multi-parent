package com.lxyw.website.restful.webservice;

import com.lxyw.authority.role.service.TokenService;
import com.lxyw.website.restful.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthorityController {

    //日志输出LOGBACK
    protected static Logger logger = LoggerFactory.getLogger(UserAuthorityController.class);

    @Autowired
    TokenService tokenService;

    @RequestMapping(value="/login", method=RequestMethod.GET)
    @ResponseBody
    public UserEntity login(){
        logger.debug("用户登录验证开始...");
        String token = tokenService.createAccessToken("inowinekwlxmnwu");
        UserEntity user = new UserEntity();
        user.setToken(token);
        logger.debug("用户登录完成...");
        return user;
    }
}
