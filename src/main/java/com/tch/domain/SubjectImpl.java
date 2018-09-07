package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.ReviewResultRepository;
import com.tch.responsity.SubjectRepository;
import com.tch.service.Subject;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "subject")
@Builder
@Data
public class SubjectImpl implements Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    private String name;
    
    @NotNull
    private String no;
    
    @Override
    public SubjectImpl getSubById(int id) {
        return SpringContextHolder.getBean(SubjectRepository.class).findOne(id);
    }
    
    @Override
    public SubjectImpl getSubByAttr(SubjectImpl subject) {
        return SpringContextHolder.getBean(SubjectRepository.class).findOne(Example.of(subject));
    }
    
    @Override
    public void insertSubject(SubjectImpl subject) {
        SpringContextHolder.getBean(SubjectRepository.class).saveAndFlush(subject);
    }
    
    @Override
    public void updateByIdSelective(SubjectImpl subject) {
        SpringContextHolder.getBean(SubjectRepository.class).saveAndFlush(subject);
    }
    
    @Override
    public void deleteById(int id) {
        SpringContextHolder.getBean(SubjectRepository.class).delete(id);
    }
}