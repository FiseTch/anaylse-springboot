package com.tch.domain.security;

import com.tch.SpringContextHolder;
import com.tch.domain.UserMessageImpl;
import com.tch.responsity.UserRepository;
import com.tch.service.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Data
@Table(name = "sys_user")
@Builder
@NoArgsConstructor
@AllArgsConstructor//指定无参与全参构造函数
public class UserImpl implements User, Serializable {
    @Id
    @Column(name = "user_no")
    private String userNo;
    
    @NotNull
    @Column(unique = true)
    private String username;
    
    @NotNull
    private String password;
    
    private String tel;
    
    @Column(name = "id_card")
    private String idCard;
    
    private String sex;
    
    private Date birthday;
    
    private String prof;
    
    private String depart;
    
    @Column(name = "hire_date")
    private Date hireDate;
    
    private String subject;
    
    @OneToMany(fetch = FetchType.EAGER)//指定一对多抓取策略
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)//指定级联操作
    @JoinColumn(name = "user_no")//指定外键
    @OrderBy("write_time desc")//按messageId降序排列
    private Set<UserMessageImpl> messageSet;
    
    @Override
    public UserImpl getUserById() {
        return SpringContextHolder.getBean(UserRepository.class).findOne(this.userNo);
    }
    
    @Override
    public List<String> getAllUserId() {
        return SpringContextHolder.getBean(UserRepository.class).getAllUserId();
    }
    
    @Override
    public UserImpl getUserByAttr(UserImpl teacher) {
        return SpringContextHolder.getBean(UserRepository.class).findOne(Example.of(this));
    }
    
    @Override
    public void insertUser() {
        SpringContextHolder.getBean(UserRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void updateByIdSelective() {
        SpringContextHolder.getBean(UserRepository.class).saveAndFlush(this);
    }
    
    
    @Override
    public void deleteById() {
        SpringContextHolder.getBean(UserRepository.class).delete(this.userNo);
    }
}