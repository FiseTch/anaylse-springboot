package com.tch.service;

import com.tch.domain.PaperImpl;

import java.util.List;

public interface PaperService {
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 根据主键查询记录
     * @return: Paper
     */
    PaperImpl getPaperById(String id);
    
    /**
     * @param paper
     * @return
     * @user: tongchaohua
     * @Title: getPaperById
     * @Description: 通过属性查询记录
     * @return: Paper
     */
    List<PaperImpl> getPaperByAttr(PaperImpl paper);
    
    /**
     * @param paper
     * @return
     * @user: tongchaohua
     * @Title: insertPaper
     * @Description: 插入记录（属性不允许为空）
     * @return: int
     */
    int insertPaper(PaperImpl paper);
    
    /**
     * @param paper
     * @return
     * @user: tongchaohua
     * @Title: insertPaperSelective
     * @Description: 插入记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int insertPaperSelective(PaperImpl paper);
    
    /**
     * @param paper
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int updateByIdSelective(PaperImpl paper);
    
    /**
     * @param paper
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    int updateById(PaperImpl paper);
    
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
