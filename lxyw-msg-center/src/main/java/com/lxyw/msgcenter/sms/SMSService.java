package com.lxyw.msgcenter.sms;

import com.kencheng.mscenter.sms.entity.SMSResult;

/**
 * 短信发送服务
 */
public interface SMSService {

    /**
     * 发送短消息
     *
     * @param phone    发送目标手机号
     * @param msg      消息内容
     * @param resource 消息来源（系统或发送人）
     * @return 发送结果
     */
    public SMSResult sendTextMessage(String phone, String msg, String resource);
}
