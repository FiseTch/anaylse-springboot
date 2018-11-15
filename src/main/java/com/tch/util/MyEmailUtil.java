package com.tch.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/14 17:37
 */

public class MyEmailUtil {
    
    public MailSender mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("");
        return javaMailSender;
    }
}
