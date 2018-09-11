package com.tch.domain.security;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户菜单表
 * @author Tongch
 * @version 1.0
 * @time 2018/9/11 11:26
 */

@Entity
@Table(name = "sys_menu")
@Builder
@Data
public class SysMenu implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private Long id;
    
    @NotNull
    @Column(name = "role_name",unique = true)
    private String roleName;
    
    private String description;
   
    
}
