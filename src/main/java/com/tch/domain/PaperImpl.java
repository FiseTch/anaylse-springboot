package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Data
@Table(name = "paper")
public class PaperImpl {
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
}