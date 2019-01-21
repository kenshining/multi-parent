package com.lxyw.logger.entity;

import java.util.Date;

public class LoggerParams {

    //日志标题
    private String loggerTitle;
    //日志级别
    private int loggerlevel;
    //日志标识
    private String loggerSign;
    //日志内容
    private String loggerContext;
    //日期产生人
    private String author;
    //日志记录时间
    private Date createTime;
    //操作备注
    private String remarks;

    public String getLoggerTitle() {
        return loggerTitle;
    }

    public void setLoggerTitle(String loggerTitle) {
        this.loggerTitle = loggerTitle;
    }

    public int getLoggerlevel() {
        return loggerlevel;
    }

    public void setLoggerlevel(int loggerlevel) {
        this.loggerlevel = loggerlevel;
    }

    public String getLoggerSign() {
        return loggerSign;
    }

    public void setLoggerSign(String loggerSign) {
        this.loggerSign = loggerSign;
    }

    public String getLoggerContext() {
        return loggerContext;
    }

    public void setLoggerContext(String loggerContext) {
        this.loggerContext = loggerContext;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
