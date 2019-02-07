package com.lxyw.authority.AbstractSurpport;

import java.util.Date;
import java.util.List;

/**
 * 统一返回信息设计
 * 声明统一返回信息字段内容
 */
public class BaseMsgEntity<T>{

    //返回消息文本内容
    private String msg;
    //返回码，区分返回类型用于前端区分提示语言内容
    private String code;
    //处理结束时间
    private Date handleTime;
    //处理结果状态，异常false 正常True
    private boolean status;
    //结果对象，返回结果是单条
    private T resultEntity;
    //结果对象，返回结果是多条
    private List<T> resultList;
    //消息请求人工号
    private String applicationPin;
    //请求申请发出时间
    private Date applicationTime;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getResultEntity() {
        return resultEntity;
    }

    public void setResultEntity(T resultEntity) {
        this.resultEntity = resultEntity;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public String getApplicationPin() {
        return applicationPin;
    }

    public void setApplicationPin(String applicationPin) {
        this.applicationPin = applicationPin;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }
}
