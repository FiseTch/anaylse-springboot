package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/15 13:36
 */
@Entity
@Table(name = "u_group")
@Data
@Builder
public class UserGroupImpl implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//表主键
    
    @Column(name = "user_no",nullable = false)
    @NotNull
    private String userNo;//
    
    @Column(name = "school_no")
    private String schoolNo;//学校编号
    
    private String type; //班级类型 初高中班
    
    private String no;//班级编号
    
    private String name;//班级名称
    
    @Column(name = "create_date")
    private Date createDate;//班级开始日期
    
    @Column(name = "end_date")
    private Date endDate;//班级结束日期
    
    private String description;//班级简介
    
    
}


