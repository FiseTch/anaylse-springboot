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
@Table(name = "user_role")
@Data
@Builder
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "role_id")
    private Long roleId;
    
    private String description;
}
