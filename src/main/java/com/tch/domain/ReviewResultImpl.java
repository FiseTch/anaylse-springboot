package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "review_result")
@Builder
@Data
public class ReviewResultImpl {
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
    
}