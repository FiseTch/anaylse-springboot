package com.tch.service;


import com.tch.domain.ReviewResultImpl;

import java.util.List;

public interface ReviewResult {
    
    
    ReviewResultImpl getRevById();
    
    List<ReviewResultImpl> getRevByAttr();
    
    void insertReviewResult();
    
    void updateByIdSelective();
    
    void deleteById();
}
