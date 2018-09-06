package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.UserRepository;
import com.tch.service.User;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/14 15:55
 */

@Entity
@Table(name = "t_user")
@Data
@Builder
public class UserImpl implements User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no", nullable = false)
    @NotNull
    private String userNo;
    
    private String name;//用户真实姓名
    @NotNull
    private String password;
    private String nickName;//用户昵称
    @NotNull
    private String sex;//性别
    @NotNull
    private String tel;
    private String email;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<UserAddressImpl> addressSet;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<UserSchoolImpl> schoolSet;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<UserGroupImpl> groupSet;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<UserMessageImpl> messageSet;
    
    @Override
    public void add(UserImpl user) {
        SpringContextHolder.getBean(UserRepository.class).saveAndFlush(user);
    }
    
}
