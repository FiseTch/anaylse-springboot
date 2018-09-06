package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "paper_detail")
@Builder
@Data
public class PaperDetailImpl {
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
    
    
}