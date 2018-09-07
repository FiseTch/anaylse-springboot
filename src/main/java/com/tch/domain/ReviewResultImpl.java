package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.PaperRepository;
import com.tch.responsity.ReviewResultRepository;
import com.tch.service.ReviewResult;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "review_result")
@Builder
@Data
public class ReviewResultImpl implements ReviewResult {
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
    public ReviewResultImpl getRevById(String id) {
        return SpringContextHolder.getBean(ReviewResultRepository.class).findOne(id);
    }
    
    @Override
    public List<ReviewResultImpl> getRevByAttr(ReviewResultImpl reviewResult) {
        return SpringContextHolder.getBean(ReviewResultRepository.class).findAll(Example.of(reviewResult));
    }
    
    @Override
    public void insertReviewResult(ReviewResultImpl reviewResult) {
        SpringContextHolder.getBean(ReviewResultRepository.class).saveAndFlush(reviewResult);
    }
    
    @Override
    public void updateByIdSelective(ReviewResultImpl reviewResult) {
        SpringContextHolder.getBean(ReviewResultRepository.class).saveAndFlush(reviewResult);
    }
    
    @Override
    public void deleteById(String id) {
        SpringContextHolder.getBean(ReviewResultRepository.class).delete(id);
    }
}