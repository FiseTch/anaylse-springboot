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
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "paper_detail")
@Builder
@Data
public class PaperDetailImpl implements PaperDetail {
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
    public PaperDetailImpl getPaperDetailById(String paperId) {
        return SpringContextHolder.getBean(PaperDetailRepository.class).findOne(paperId);
    }
    
    @Override
    public List<PaperDetailImpl> getPaperDetailByAttr(PaperDetailImpl paperDetail) {
        return SpringContextHolder.getBean(PaperDetailRepository.class).findAll(Example.of(paperDetail));
    }
    
    
    @Override
    public void insertPaperDetail(PaperDetailImpl paperDetail) {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(paperDetail);
    }
    
    @Override
    public void insertPaperDetailSelective(PaperDetailImpl paperDetail) {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(paperDetail);
    }
    
    
    @Override
    public void updateById(PaperDetailImpl paperDetail) {
        SpringContextHolder.getBean(PaperDetailRepository.class).saveAndFlush(paperDetail);
    }
    
    @Override
    public void deleteById(String paperId) {
        SpringContextHolder.getBean(PaperDetailRepository.class).delete(paperId);
    }
}