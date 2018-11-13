package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.SubjectRepository;
import com.tch.service.Subject;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "subject")
@Builder
@Data
public class SubjectImpl implements Subject, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    private String name;
    
    @NotNull
    private String no;
    
    @Override
    public SubjectImpl getSubById() {
        return SpringContextHolder.getBean(SubjectRepository.class).findOne(this.id);
    }
    
    @Override
    public SubjectImpl getSubByAttr() {
        return SpringContextHolder.getBean(SubjectRepository.class).findOne(Example.of(this));
    }
    
    @Override
    public void insertSubject() {
        SpringContextHolder.getBean(SubjectRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void updateByIdSelective() {
        SpringContextHolder.getBean(SubjectRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void deleteById() {
        SpringContextHolder.getBean(SubjectRepository.class).delete(this.id);
    }
}