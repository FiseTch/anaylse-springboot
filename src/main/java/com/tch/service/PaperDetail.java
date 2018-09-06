package com.tch.service;

import com.tch.domain.PaperDetailImpl;

import java.util.List;

public interface PaperDetail {
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: getPaperDetailById
     * @Description: 根据主键查询记录
     * @return: PaperDetail
     */
    PaperDetailImpl getPaperDetailById(String paperid);
    
    /**
     * @param PaperDetail
     * @return
     * @user: tongchaohua
     * @Title: getPaperDetailById
     * @Description: 通过属性查询记录
     * @return: PaperDetail
     */
    List<PaperDetailImpl> getPaperDetailByAttr(PaperDetailImpl paperDetail);
    
    /**
     * @param paperDetail
     * @return
     * @user: tongchaohua
     * @Title: getGeneralPaperDetailByAttr
     * @Description: 通过五个属性进行模糊查询
     * @return: List<PaperDetail>
     */
    List<PaperDetailImpl> getGeneralPaperDetailByAttr(PaperDetailImpl paperDetail);
    
    /**
     * @param PaperDetail
     * @return
     * @user: tongchaohua
     * @Title: insertPaperDetail
     * @Description: 插入记录（属性不允许为空）
     * @return: int
     */
    int insertPaperDetail(PaperDetailImpl paperDetail);
    
    /**
     * @param PaperDetail
     * @return
     * @user: tongchaohua
     * @Title: insertPaperDetailSelective
     * @Description: 插入记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int insertPaperDetailSelective(PaperDetailImpl paperDetail);
    
    /**
     * @param PaperDetail
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（除主键外。其他属性允许为空）
     * @return: int
     */
    int updateByIdSelective(PaperDetailImpl paperDetail);
    
    /**
     * @param PaperDetail
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    int updateById(PaperDetailImpl paperDetail);
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 删除记录
     * @return: int
     */
    int deleteById(String paperid);
}
