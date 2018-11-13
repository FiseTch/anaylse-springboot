package com.tch.service;

import com.tch.domain.SubjectImpl;

public interface Subject {
    
    
    SubjectImpl getSubById();
    
    SubjectImpl getSubByAttr();
    
    void insertSubject();
    
   
    void updateByIdSelective();
    
    void deleteById();
}
