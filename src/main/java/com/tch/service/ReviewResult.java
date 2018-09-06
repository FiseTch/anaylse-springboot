package com.tch.service;


import com.tch.domain.ReviewResultImpl;

import java.util.List;

public interface ReviewResult {
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 根据主键查询记录
     * @return: ReviewResult
     */
    ReviewResultImpl getRevById(String id);
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: getRevByAttr
     * @Description: 通过属性查询记录
     * @return: ReviewResult
     */
    List<ReviewResultImpl> getRevByAttr(ReviewResultImpl reviewResult);
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: getGeneralRevByAttr
     * @Description: 模糊查询
     * @return: List<ReviewResult>
     */
    List<ReviewResultImpl> getGeneralRevByAttr(ReviewResultImpl reviewResult);
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: ReviewResult
     * @Description: 插入记录（属性不允许为空）
     * @return: int
     */
    int insertReviewResult(ReviewResultImpl reviewResult);
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: insertReviewResultSelective
     * @Description: 插入记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int insertReviewResultSelective(ReviewResultImpl reviewResult);
    
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int updateByIdSelective(ReviewResultImpl reviewResult);
    
    /**
     * @param reviewResult
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    int updateById(ReviewResultImpl reviewResult);
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 删除记录
     * @return: int
     */
    int deleteById(String id);
}
