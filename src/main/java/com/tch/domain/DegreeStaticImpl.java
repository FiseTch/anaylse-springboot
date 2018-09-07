package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.DegreeStaticRepository;
import com.tch.service.DegreeStatic;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;

@Entity
@Table(name = "degree_static")
@Builder
@Data
public class DegreeStaticImpl implements DegreeStatic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String level;
    
    private String grade;
    
    @Override
    public DegreeStaticImpl getDegById(int id) {
        return SpringContextHolder.getBean(DegreeStaticRepository.class).findOne(id);
    }
    
    @Override
    public DegreeStaticImpl getDegByAttr(DegreeStaticImpl degreeStatic) {
        return SpringContextHolder.getBean(DegreeStaticRepository.class).findOne(Example.of(degreeStatic));
    }
    
    @Override
    public void insertDegreeStatic(DegreeStaticImpl degreeStatic) {
        SpringContextHolder.getBean(DegreeStaticRepository.class).saveAndFlush(degreeStatic);
    }
    
    
    @Override
    public void updateByIdSelective(DegreeStaticImpl degreeStatic) {
        SpringContextHolder.getBean(DegreeStaticRepository.class).saveAndFlush(degreeStatic);
    }
    
    
    @Override
    public void deleteById(int id) {
        SpringContextHolder.getBean(DegreeStaticRepository.class).delete(id);
    }
}