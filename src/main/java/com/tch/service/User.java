package com.tch.service;

import com.tch.domain.security.UserImpl;

import java.util.List;


public interface User {
    
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: selectById
     * @Description: 通过主键id查询记录
     * @return: User
     */
    UserImpl getUserById(Long id);
    
    /**
     * @return
     * @user: tongchaohua
     * @Title: getAllTeacId
     * @Description: 查询所有的用户id
     * @return: List<String>
     */
    List<String> getAllUserId();
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: getTeacByAttr
     * @Description: 通过属性查询记录
     * @return: User
     */
    UserImpl getUserByAttr(UserImpl teacher);
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: insertTeacher
     * @Description: 插入一条记录（属性不允许为空）
     * @return: int
     */
    void insertUser(UserImpl teacher);
    
    
    /**
     * @param teacher
     * @return
     * @user: tongchaohua
     * @Title: updateByIdSelective
     * @Description: 更新记录（属性允许为空除主键外）
     * @return: int
     */
    void updateByIdSelective(UserImpl teacher);
    
    
    /**
     * @param id
     * @return
     * @user: tongchaohua
     * @Title: deleteById
     * @Description: 通过主键id删除记录
     * @return: int
     */
    void deleteById(Long id);
}
