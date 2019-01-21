package com.lxyw.msgcenter.mail.impl;

import com.lxyw.msgcenter.mail.MailService;
import com.lxyw.msgcenter.mail.entity.MailResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.util.Map;
import java.util.Set;

@Service("mailService")
public class MailServiceImpl implements MailService {

    //日志输出LOGBACK
    protected static Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

    @Autowired
    JavaMailSender mailSender;

    /**
     * 电子邮件发送服务
     *
     * @param mailTo      收信人Email地址
     * @param sendFrom    发件人署名
     * @param subject     发件主题
     * @param mailContent 邮件内容
     * @return
     */
    @Override
    public MailResult sendEmail(String mailTo, String sendFrom, String subject, String mailContent) {

        //设置发送配置信息
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(sendFrom);//发起者
        //多收件人配置可参考传入组合字符串
        //例如：mailMessage.setTo("1xx.com","2xx.com","3xx.com");
        mailMessage.setTo(mailTo);//接受者
        mailMessage.setSubject(subject);
        mailMessage.setText(mailContent);
        //设置返回值
        MailResult mailresult = new MailResult();
        mailresult.setAddress(sendFrom);
        mailresult.setMailTo(mailTo);
        mailresult.setMailContent(mailContent);
        //执行发送操作
        try {
            logger.info("正在发送邮件（无附件）...");
            logger.info("To:" + mailTo);
            logger.info("From:" + sendFrom);
            logger.info("Content:" + mailContent);
            mailSender.send(mailMessage);
            logger.info("发送邮件（无附件）成功！");
            mailresult.setMsg("发送邮件（无附件）成功！");
            mailresult.setStatus("SUCCESS");
        } catch (Exception e) {
            logger.info("发送邮件（无附件）异常！");
            e.printStackTrace();
            mailresult.setMsg("发送邮件（无附件）异常！");
            mailresult.setStatus("FAIL");
        } finally {
            return mailresult;
        }

    }

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
    public MailResult sendEmailAttachment(String mailTo, String sendFrom, String subject, String mailContent, Map<String, File> fileMap) {
        //设置发送配置信息
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //设置返回值
        MailResult mailresult = new MailResult();
        mailresult.setAddress(sendFrom);
        mailresult.setMailTo(mailTo);
        mailresult.setMailContent(mailContent);
        //执行发送操作
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
            //多收件人配置可参考传入组合字符串
            //例如：mailMessage.setTo("1xx.com","2xx.com","3xx.com");
            messageHelper.setTo(mailTo);
            messageHelper.setFrom(sendFrom);
            messageHelper.setSubject(subject);
            messageHelper.setText(mailContent);
            logger.info("设置邮件附件...");
            Set<String> fileNames = fileMap.keySet();
            for (String fileName : fileNames) {
                File file = fileMap.get(fileName);
                messageHelper.addAttachment(MimeUtility.encodeWord(fileName), file);
            }
            logger.info("正在发送邮件（有附件）...");
            logger.info("To:" + mailTo);
            logger.info("From:" + sendFrom);
            logger.info("Content:" + mailContent);
            mailSender.send(mimeMessage);
            logger.info("发送邮件（有附件）成功！");
            mailresult.setMsg("发送邮件（有附件）成功！");
            mailresult.setStatus("SUCCESS");
        } catch (Exception e) {
            logger.info("发送邮件（有附件）异常！");
            e.printStackTrace();
            mailresult.setMsg("发送邮件（有附件）异常！");
            mailresult.setStatus("FAIL");
        } finally {
            return mailresult;
        }

    }
}
