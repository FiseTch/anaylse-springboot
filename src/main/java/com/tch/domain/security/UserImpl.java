package com.tch.domain.security;

import com.tch.SpringContextHolder;
import com.tch.responsity.UserRepository;
import com.tch.service.User;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Table(name = "sys_user")
@Builder
public class UserImpl implements User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(unique = true)
    private Long uid;
    
    @NotNull
    @Column(unique = true)
    private String username;
    
    @NotNull
    private String password;
    
    private String tel;
    
    private String idCard;
    
    private String sex;
    
    private Date birthday;
    
    private String prof;
    
    private String depart;
    
    private Date hireDate;
    
    private String subject;
    
    
    @Override
    public UserImpl getUserById(Long id) {
        return SpringContextHolder.getBean(UserRepository.class).findOne(id);
    }
    
    @Override
    public List<String> getAllUserId() {
        return SpringContextHolder.getBean(UserRepository.class).getAllUserId();
    }
    
    @Override
    public UserImpl getUserByAttr(UserImpl teacher) {
        return SpringContextHolder.getBean(UserRepository.class).findOne(Example.of(teacher));
    }
    
    @Override
    public void insertUser(UserImpl teacher) {
        SpringContextHolder.getBean(UserRepository.class).saveAndFlush(teacher);
    }
    
    @Override
    public void updateByIdSelective(UserImpl teacher) {
        SpringContextHolder.getBean(UserRepository.class).saveAndFlush(teacher);
    }
    
    
    @Override
    public void deleteById(Long id) {
        SpringContextHolder.getBean(UserRepository.class).delete(id);
    }
}