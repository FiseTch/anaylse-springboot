package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Data
@Table(name = "teacher")
@Builder
public class TeacherImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotNull
    private String name;
    
    private String tel;
    
    private String idCard;
    
    private String sex;
    
    private Date birthday;
    
    private String prof;
    
    private String depart;
    
    private Date hireDate;
    
    private String subject;
    @NotNull
    private String password;
}