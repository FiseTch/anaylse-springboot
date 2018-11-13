package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/16 9:58
 */

@Entity
@Table(name = "u_address")
@Data
@Builder
public class UserAddressImpl implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "user_no",nullable = false)
    @NotNull
    private String userNo;
    
    private String type;//判断是什么地址（家庭，公司）
    
    private String country;//国家
    
    private String province;//省
    
    private String city;//市
    
    private String area;//区
    
    private String detail;//详细街道信息
    
    
}
