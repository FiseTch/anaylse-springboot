package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/15 13:42
 */
@Entity
@Table(name = "u_school")
@Data
@Builder
public class UserSchoolImpl implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "user_no",nullable = false)
    @NotNull
    private String userNo;
    
    private String type;//初高中小学，学校类型
    
    private String name;//学校名称
    
    private String no;//学校编号
    
    private String address;//学校地址
    
    private String description;//学校描述
}
