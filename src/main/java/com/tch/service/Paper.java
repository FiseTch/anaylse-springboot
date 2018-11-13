package com.tch.service;

import com.tch.domain.PaperImpl;

import java.util.List;

public interface Paper {
    
    
    PaperImpl getPaperById();
  
    List<PaperImpl> getPaperByAttr();
    
    void insertPaper();
    
    void updateByIdSelective();
    
    void deleteById();
}
