package com.tch.service;


import com.tch.domain.DegreeStaticImpl;

public interface DegreeStatic {
    
    
    
    DegreeStaticImpl getDegById();
    
    DegreeStaticImpl getDegByAttr();
   
    void insertDegreeStatic();
    
    void updateByIdSelective();
    
    void deleteById();
}
