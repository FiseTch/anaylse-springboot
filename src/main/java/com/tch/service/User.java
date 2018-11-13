package com.tch.service;

import com.tch.domain.security.UserImpl;

import java.util.List;


public interface User {
    
    UserImpl getUserById();
    
    List<String> getAllUserId();
    
    UserImpl getUserByAttr(UserImpl teacher);
    
    void insertUser();
    
    void updateByIdSelective();
    
    void deleteById();
}
