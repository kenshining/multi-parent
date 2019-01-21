package com.lxyw.website.restful.entity;

import java.util.Date;
import java.util.Map;

/**
 * 公共返回对象基类
 * 定义返回对象基础属性
 */
public class AbstractEntity {

    //数据主键
    private String id;
    //创建时间
    private Date createdDate;
    //更新时间
    private Date updatedDate;
    //创建人
    private String createdBy;
    //更新人
    private String updatedBy;
    //返回状态 0-失败、1-成功
    private int status;
    //返回提示信息或者异常信息
    private String message;
    //其他返回信息集合
    private Map<String,Object> results;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }
}
