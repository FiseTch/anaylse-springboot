package com.tch.domain;

import com.tch.SpringContextHolder;
import com.tch.domain.security.UserImpl;
import com.tch.responsity.MessageRepository;
import com.tch.service.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/15 13:52
 */

@Entity
@Table(name = "u_message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMessageImpl implements Message, Serializable {
    
    @Id
    @Column(name = "message_id")
    private String messageId;//留言回话id
    
    
    @Column(name = "user_no", nullable = false)
    @NotNull
    private String userNo;
    
    
    @Column(name = "write_user_no")
    private String writeUserNo;
    
    
    @Column(name = "write_time")
    private Date writeTime;
    
    private int praise;//点赞数
    
    private String description;
    
    
    @Override
    public List<UserMessageImpl> getAllMessage() {
        return SpringContextHolder.getBean(MessageRepository.class).getAllMessage(this.userNo);
    }
    
    @Override
    public void addPraise() {
        SpringContextHolder.getBean(MessageRepository.class).addPraise(this.messageId);
    }
    
    @Override
    public void subPraise() {
        SpringContextHolder.getBean(MessageRepository.class).subPraise(this.messageId);
    }
    
    @Override
    public void deleteMessageById() {
        SpringContextHolder.getBean(MessageRepository.class).delete(this.messageId);
    }
    
    @Override
    public void deleteAllMessage() {
        SpringContextHolder.getBean(MessageRepository.class).deleteAllMessage(this.userNo);
    }
    
    @Override
    public void addMessage() {
        SpringContextHolder.getBean(MessageRepository.class).saveAndFlush(this);
    }
}
