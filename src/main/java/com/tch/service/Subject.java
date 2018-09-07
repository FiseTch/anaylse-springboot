package com.tch.service;

import com.tch.domain.SubjectImpl;

public interface Subject {
    
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 通过抓紧id查询记录
     * @return: Subject
     */
    SubjectImpl getSubById(int id);
    
    /**
     * @param subject
     * @return
     * @user: tongchaohua
     * @Title: getSubByAttr
     * @Description: 通过属性查询记录
     * @return: Subject
     */
    SubjectImpl getSubByAttr(SubjectImpl subject);
    
    /**
     * @param subject
     * @return
     * @user: tongchaohua
     * @Title: insertSubject
     * @Description: 插入记录（不允许为空）
     * @return: int
     */
    void insertSubject(SubjectImpl subject);
    
    
    /**
     * @param subject
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（除主键外，其他属性允许为空）
     * @return: int
     */
    void updateByIdSelective(SubjectImpl subject);
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 通过主键id删除用户
     * @return: int
     */
    void deleteById(int id);
}
