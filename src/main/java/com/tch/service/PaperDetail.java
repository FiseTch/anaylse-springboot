package com.tch.service;

import com.tch.domain.PaperDetailImpl;

import java.util.List;

public interface PaperDetail {
    
    
    PaperDetailImpl getPaperDetailById();
    
    List<PaperDetailImpl> getPaperDetailByAttr();
    
    void insertPaperDetail();
   
    void insertPaperDetailSelective();
  
    void updateById();
    
    void deleteById();
}
