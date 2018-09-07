package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.SubjectRepository;
import com.tch.responsity.TeacherRepository;
import com.tch.service.Teacher;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Table(name = "t_teacher")
@Builder
public class TeacherImpl implements Teacher {
    @Id
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
    
    @Override
    public TeacherImpl getTeacById(String id) {
        return SpringContextHolder.getBean(TeacherRepository.class).findOne(id);
    }
    
    @Override
    public List<String> getAllTeacId() {
        return SpringContextHolder.getBean(TeacherRepository.class).getAllTeacId();
    }
    
    @Override
    public TeacherImpl getTeacByAttr(TeacherImpl teacher) {
        return SpringContextHolder.getBean(TeacherRepository.class).findOne(Example.of(teacher));
    }
    
    @Override
    public void insertTeacher(TeacherImpl teacher) {
        SpringContextHolder.getBean(TeacherRepository.class).saveAndFlush(teacher);
    }
    
    @Override
    public void updateByIdSelective(TeacherImpl teacher) {
        SpringContextHolder.getBean(TeacherRepository.class).saveAndFlush(teacher);
    }
    
    
    @Override
    public void deleteById(String id) {
        SpringContextHolder.getBean(TeacherRepository.class).delete(id);
    }
}