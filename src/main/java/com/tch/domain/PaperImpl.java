package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.responsity.PaperRepository;
import com.tch.service.Paper;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Example;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Data
@Table(name = "paper")
public class PaperImpl implements Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "paper_id", nullable = false)
    private String paperId;
    
    private String subject;
    
    private Integer score;
    
    @Column(name = "subject_person")
    private String subjectPerson;
    
    private String teacher;
    
    private Date time;
    
    @Column(name = "paper_time")
    private String paperTime;
    
    private String term;
    
    private Integer num;
    
    @Column(name = "excel_order")
    private Integer excelOrder;
    
    private String param1;
    
    private String param2;
    
    private String param3;
    
    private String param4;
    
    private String param5;
    
    private String param6;
    
    private String param7;
    
    private String param8;
    
    private String param9;
    
    private String param10;
    
    private String param11;
    
    private String param12;
    
    private String param13;
    
    private String param14;
    
    private String param15;
    
    private String param16;
    
    private String param17;
    
    private String param18;
    
    private String param19;
    
    private String param20;
    
    private String param21;
    
    private String param22;
    
    private String param23;
    
    private String param24;
    
    private String param25;
    
    @Override
    public PaperImpl getPaperById(int id) {
       return SpringContextHolder.getBean(PaperRepository.class).findOne(id);
    }
    
    @Override
    public List<PaperImpl> getPaperByAttr(PaperImpl paper) {
        return SpringContextHolder.getBean(PaperRepository.class).findAll(Example.of(paper));
    }
    
    @Override
    public void insertPaper(PaperImpl paper) {
        SpringContextHolder.getBean(PaperRepository.class).saveAndFlush(paper);
    }
    
    @Override
    public void updateByIdSelective(PaperImpl paper) {
        SpringContextHolder.getBean(PaperRepository.class).saveAndFlush(paper);
    }
    
    
    @Override
    public void deleteById(int id) {
        SpringContextHolder.getBean(PaperRepository.class).delete(id);
    }
}