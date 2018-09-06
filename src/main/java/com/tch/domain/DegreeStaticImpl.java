package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.DegreeStaticRepository;
import com.tch.service.DegreeStatic;
import lombok.Builder;
import lombok.Data;

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
        return null;
    }
    
    @Override
    public int insertDegreeStatic(DegreeStaticImpl degreeStatic) {
        return 0;
    }
    
    @Override
    public int insertDegreeStaticSelective(DegreeStaticImpl degreeStatic) {
        return 0;
    }
    
    @Override
    public int updateByIdSelective(DegreeStaticImpl degreeStatic) {
        return 0;
    }
    
    @Override
    public int updateById(DegreeStaticImpl degreeStatic) {
        return 0;
    }
    
    @Override
    public int deleteById(Integer id) {
        return 0;
    }
}