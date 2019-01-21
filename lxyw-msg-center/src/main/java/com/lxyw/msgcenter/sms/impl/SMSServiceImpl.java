package com.lxyw.msgcenter.sms.impl;

import com.kencheng.mscenter.sms.entity.SMSResult;
import com.lxyw.msgcenter.sms.SMSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSServiceImpl implements SMSService {

    //日志输出LOGBACK
    protected static Logger logger = LoggerFactory.getLogger(SMSServiceImpl.class);

    /**
     * 发送短消息
     *
     * @param phone    发送目标手机号
     * @param msg      消息内容
     * @param resource 消息来源（系统或发送人）
     * @return 发送结果
     */
    @Override
    public SMSResult sendTextMessage(String phone, String msg, String resource) {
        SMSResult result = new SMSResult();

        return result;
    }
}
