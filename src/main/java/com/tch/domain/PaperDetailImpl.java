package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.PaperDetailRepository;
import com.tch.service.PaperDetail;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "paper_detail")
@Builder
@Data
public class PaperDetailImpl implements PaperDetail, Serializable {
    @Id
    @Column(name = "paper_id")
    private String paperId;
    
    @NotNull
    private String tId;
    
    private String subject;
    
    private Integer score;
    
    @Column(name = "total_title")
    private Integer totalTitle;
    
    private Date time;
    
    @Column(name = "subject_person")
    private String subjectPerson;
    
    private Date uptime;
    
    private String teacher;
    
    @Column(name = "paper_time", nullable = false)
    private String paperTime;
    
    private Integer num;
    
    private String term;
    
    @Override
    public PaperDetailImpl getPaperDetailById() {
        return SpringContextHolder.getBean(PaperDetailRepository.class).findOne(this.paperId);
    }
    
    @Override
    public List<PaperDetailImpl> getPaperDetailByAttr() {
        return SpringContextHolder.getBean(PaperDetailRepository.class).findAll(Example.of(this));
    }
    
    
    @Override
    public void insertPaperDetail() {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void insertPaperDetailSelective() {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(this);
    }
    
    
    @Override
    public void updateById() {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(this);
    }
    
    @Override
    public void deleteById() {
        SpringContextHolder.getBean(PaperDetailRepository.class).delete(this.paperId);
    }
}