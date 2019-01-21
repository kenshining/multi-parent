package com.kencheng.mscenter.sms.entity;

import java.util.Date;

public class SMSResult {

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 短信内容
     */
    private String smsMsg;

    /**
     * 发送状态
     */
    private String smsStatus;

    /**
     * 发送时间
     */
    private Date sendDate;

    /**
     * 来源
     */
    private String source;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSmsMsg() {
        return smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
