package com.lxyw.logger.entity;

import java.util.Date;

public class LoggerResult {
    //入参对象
    private LoggerParams loggerParams;
    //日志序列号
    private String serialno;
    //记录时间
    private Date createTime;
    //处理结果
    private String results;
    //处理状态
    private String accessStatus;

    public LoggerParams getLoggerParams() {
        return loggerParams;
    }

    public void setLoggerParams(LoggerParams loggerParams) {
        this.loggerParams = loggerParams;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }
}
