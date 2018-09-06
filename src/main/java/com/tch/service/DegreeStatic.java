package com.tch.service;


import com.tch.domain.DegreeStaticImpl;

public interface DegreeStatic {
    
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 通过主键id查询记录
     * @return: DegreeStatic
     */
    DegreeStaticImpl getDegById(int id);
   
    /**
     * @param degreeStatic
     * @return
     * @user: tongchaohua
     * @Title: getDegByAttr
     * @Description: 通过属性查询记录
     * @return: DegreeStatic
     */
    DegreeStaticImpl getDegByAttr(DegreeStaticImpl degreeStatic);
    
    /**
     * @param degreeStatic
     * @return
     * @user: tongchaohua
     * @Title: insertDegreeStatic
     * @Description: 插入一条记录（属性不允许为空）
     * @return: int
     */
    int insertDegreeStatic(DegreeStaticImpl degreeStatic);
    
    /**
     * @param degreeStatic
     * @return
     * @user: tongchaohua
     * @Title: insertDegreeStaticSelective
     * @Description: 插入一条记录（属性允许为空）
     * @return: int
     */
    int insertDegreeStaticSelective(DegreeStaticImpl degreeStatic);
    
    
    /**
     * @param degreeStatic
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（属性允许为空除主键外）
     * @return: int
     */
    int updateByIdSelective(DegreeStaticImpl degreeStatic);
    
    /**
     * @param degreeStatic
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    int updateById(DegreeStaticImpl degreeStatic);
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 通过主键id删除记录
     * @return: int
     */
    int deleteById(Integer id);
}
