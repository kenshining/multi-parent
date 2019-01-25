package com.lxyw.authority.cas.controller;

import com.lxyw.authority.cas.entity.CasResult;
import com.lxyw.authority.role.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CasController {

    @Autowired
    TokenService tokenService;

    @RequestMapping(value="/cas_authorlogin", method=RequestMethod.POST)
    public ModelAndView cas_authorlogin(HttpServletRequest request, HttpServletResponse response){

        //登录跳回URL
        String redirectPath = (String) request.getAttribute("redirectPath");
        String userPin = (String) request.getAttribute("username");
        String userPass = (String) request.getAttribute("password");
        String systemId = (String) request.getAttribute("systemId");

        //登录成功时的跳转
        ModelAndView mv = new ModelAndView("forward:"+redirectPath);//默认为forward模式
        //验证用户名与密码
        CasResult casResult = new CasResult();
        casResult.setToken(tokenService.createAccessToken(userPin));
        mv.addObject(casResult);
        return mv;
    }
}
