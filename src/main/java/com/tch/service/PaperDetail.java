package com.tch.service;

import com.tch.domain.PaperDetailImpl;

import java.util.List;

public interface PaperDetail {
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: getPaperDetailById
     * @Description: 根据主键查询记录
     * @return: PaperDetail
     */
    PaperDetailImpl getPaperDetailById(String paperId);
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: getPaperDetailById
     * @Description: 通过属性查询记录
     * @return: PaperDetail
     */
    List<PaperDetailImpl> getPaperDetailByAttr(PaperDetailImpl paperDetail);
    
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: insertPaperDetail
     * @Description: 插入记录（属性不允许为空）
     * @return: int
     */
    void insertPaperDetail(PaperDetailImpl paperDetail);
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: insertPaperDetailSelective
     * @Description: 插入记录（除主键外。其他属性允许为空）
     * @return: int
     */
    void insertPaperDetailSelective(PaperDetailImpl paperDetail);
    
   
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    void updateById(PaperDetailImpl paperDetail);
    
    /**
     * @param
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 删除记录
     * @return: int
     */
    void deleteById(String paperId);
}
