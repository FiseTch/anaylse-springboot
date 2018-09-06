package com.tch.service;

import com.tch.domain.TeacherImpl;

import java.util.List;


public interface Teacher {
    
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 通过主键id查询记录
     * @return: Teacher
     */
    Teacher getTeacById(String id);
    
    /**
     * @return
     * @user: tongchaohua
     * @Title: getAllTeacId
     * @Description: 查询所有的用户id
     * @return: List<String>
     */
    List<String> getAllTeacId();
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: getTeacByAttr
     * @Description: 通过属性查询记录
     * @return: Teacher
     */
    Teacher getTeacByAttr(TeacherImpl teacher);
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: insertTeacher
     * @Description: 插入一条记录（属性不允许为空）
     * @return: int
     */
    int insertTeacher(TeacherImpl teacher);
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: insertTeacherSelective
     * @Description: 插入一条记录（属性允许为空）
     * @return: int
     */
    int insertTeacherSelective(TeacherImpl teacher);
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（属性允许为空除主键外）
     * @return: int
     */
    int updateByIdSelective(TeacherImpl teacher);
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: updateById
     * @Description: 更新记录（属性不允许为空）
     * @return: int
     */
    int updateById(TeacherImpl teacher);
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 通过主键id删除记录
     * @return: int
     */
    int deleteById(String id);
}
