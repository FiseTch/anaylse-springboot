package com.tch.test;

import com.tch.TestApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQConnectionFactoryCustomizer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/14 17:52
 */
public class MailTest extends TestApplicationTests {
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    
    @Autowired
    
    @Test
    public void testMail() {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("2289717264@qq.com");//设置发送人名称
            mailMessage.setTo("tongchaohua@szkingdom.com");
            mailMessage.setText("http://www.baidu.com");
            mailMessage.setSubject("溜达的小黄毛");
            javaMailSender.send(mailMessage);
        
        
    }
}
