package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.DegreeStaticRepository;
import com.tch.service.DegreeStatic;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "degree_static")
@Builder
@Data
public class DegreeStaticImpl implements DegreeStatic, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String level;
    
    private String grade;
    
    @Override
    public DegreeStaticImpl getDegById() {
        return SpringContextHolder.getBean(DegreeStaticRepository.class).findOne(this.id);
    }
    
    @Override
    public DegreeStaticImpl getDegByAttr() {
        return SpringContextHolder.getBean(DegreeStaticRepository.class).findOne(Example.of(this));
    }
    
    @Override
    public void insertDegreeStatic() {
        SpringContextHolder.getBean(DegreeStaticRepository.class).saveAndFlush(this);
    }
    
    
    @Override
    public void updateByIdSelective() {
        SpringContextHolder.getBean(DegreeStaticRepository.class).saveAndFlush(this);
    }
    
    
    @Override
    public void deleteById() {
        SpringContextHolder.getBean(DegreeStaticRepository.class).delete(this.id);
    }
}