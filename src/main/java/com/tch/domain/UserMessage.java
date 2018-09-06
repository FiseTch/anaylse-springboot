package com.tch.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/15 13:52
 */

@Entity
@Table(name = "u_message")
@Data
@Builder
public class UserMessage {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "user_no",nullable = false)
    @NotNull
    private String userNo;
    
    @Column(name = "message_id")
    private String messageId;//留言回话id
    
    @Column(name = "write_user_no")
    private String writeUserNo;
    
    @Column(name = "read_user_no")
    private String readUserNo;
    
    @Column(name = "write_time")
    private Date writeTime;
    
    private int praise;//点赞数
    
    private String description;
}
