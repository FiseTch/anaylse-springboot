package com.tch.service;

import com.tch.domain.UserMessageImpl;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/12 11:21
 */
public interface Message {
    
    void addMessage();
    
    List<UserMessageImpl> getAllMessage();
    
    
    void addPraise();
    
    
    void subPraise();
    
    
    void deleteMessageById();
    
    
    void deleteAllMessage();
}
