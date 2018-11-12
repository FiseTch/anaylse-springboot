package com.tch.test;

import com.tch.TestApplicationTests;
import com.tch.domain.UserMessageImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/12 14:12
 */
public class UMessageTest extends TestApplicationTests {
    
    @Test
    public void addTest() {
        UserMessageImpl userMessage = UserMessageImpl.builder().messageId("1111").userNo("tch").description("it's a test").build();
        System.out.println(userMessage);
        userMessage.deleteAllMessage();
    }
    
    @Test
    public void addPraise() {
        UserMessageImpl userMessage = UserMessageImpl.builder().messageId("2222").userNo("tch").description("it's a test").build();
        
        List<UserMessageImpl> allMessage = userMessage.getAllMessage();
        
        for (int i = 0; i < allMessage.size(); i++) {
            System.out.println(allMessage.get(i));
        }
        
        System.out.println(userMessage);
    }
    
    @Test
    public void deleteTest() {
        UserMessageImpl userMessage = UserMessageImpl.builder().messageId("1111").userNo("tch").description("it's a test").build();
        System.out.println(userMessage);
        userMessage.deleteAllMessage();
    }
    
}
