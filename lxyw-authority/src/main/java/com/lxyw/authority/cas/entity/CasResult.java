package com.lxyw.authority.cas.entity;

import java.io.Serializable;
import java.util.Date;

public class CasResult implements Serializable {

    //用户名
    private String userName;
    //登录令牌
    private String token;
    //认证截止时间
    private Date deadline;
    //认证消息
    private String msg;
    //认证结果编码
    private String msgCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }
}
