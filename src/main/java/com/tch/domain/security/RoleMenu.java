package com.tch.domain.security;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/11 16:20
 */
@Entity
@Table(name = "role_menu")
@Data
@Builder
public class RoleMenu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "role_id")
    private Long roleId;
    
    @Column(name = "menu_id")
    private Long menuId;
    
    private String description;
    
}
