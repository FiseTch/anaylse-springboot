package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.ReviewResultRepository;
import com.tch.service.ReviewResult;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "review_result")
@Builder
@Data
public class ReviewResultImpl implements ReviewResult, Serializable {
    @Id
    private String id;
    
    @NotNull
    private String pId;
    
    @NotNull
    private String tId;
    
    @NotNull
    private Date time;
    
    private Double validityA;
    
    private Double validityB;
    
    private Double reliability;
    
    private Double difficulty;
    
    private Double distinction;
    
    @Override
    public ReviewResultImpl getRevById() {
        return SpringContextHolder.getBean(ReviewResultRepository.class).findOne(this.id);
    }
    
    @Override
    public List<ReviewResultImpl> getRevByAttr() {
        return SpringContextHolder.getBean(ReviewResultRepository.class).findAll(Example.of(this));
    }
    
    @Override
    public void insertReviewResult() {
        SpringContextHolder.getBean(ReviewResultRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void updateByIdSelective() {
        SpringContextHolder.getBean(ReviewResultRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void deleteById() {
        SpringContextHolder.getBean(ReviewResultRepository.class).delete(this.id);
    }
}