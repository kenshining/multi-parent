package com.lxyw.msgcenter.mail;

import com.lxyw.msgcenter.mail.entity.MailResult;

import java.io.File;
import java.util.Map;

/**
 * 邮件发送服务
 */

public interface MailService {

    /**
     * 电子邮件发送服务(无附件)
     *
     * @param mailTo      收信人Email地址
     * @param sendFrom    发件人署名
     * @param subject     发件主题
     * @param mailContent 邮件内容
     * @return
     */
    public MailResult sendEmail(String mailTo, String sendFrom, String subject, String mailContent);

    /**
     * 电子邮件发送服务(有附件)
     *
     * @param mailTo      收信人Email地址
     * @param sendFrom    发件人署名
     * @param subject     发件主题
     * @param mailContent 邮件内容
     * @param fileMap     邮件附件
     * @return
     */
    public MailResult sendEmailAttachment(String mailTo, String sendFrom, String subject, String mailContent, Map<String, File> fileMap);
}
