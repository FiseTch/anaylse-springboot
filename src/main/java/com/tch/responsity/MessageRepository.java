package com.tch.responsity;

import com.tch.domain.UserMessageImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 加事务注解是为了让删改更新操作能够成功
 * @author Tongch
 * @version 1.0
 * @time 2018/8/16 10:14
 */
@Transactional
public interface MessageRepository extends JpaRepository<UserMessageImpl, String> {
    
    @Modifying
    @Query(value = "select mes.message_id, mes.description, mes.praise, mes.read_user_no, mes.user_no, mes.write_time,mes.write_user_no from u_message mes where mes.user_no = :user_no", nativeQuery = true)
    List<UserMessageImpl> getAllMessage(@Param("user_no") String user_no);
    
    @Modifying
    @Query(value = "UPDATE u_message uMessage SET uMessage.praise = uMessage.praise +1 where uMessage.message_id = ?1", nativeQuery = true)
    void addPraise(String messageId);
    
    @Modifying
    @Query(value = "UPDATE u_message uMessage SET uMessage.praise = uMessage.praise -1 where uMessage.message_id = ?1", nativeQuery = true)
    void subPraise(String messageId);
    
    
    @Modifying
    @Query(value = "delete  from  u_message where user_no = :user_no", nativeQuery = true)
    void deleteAllMessage(@Param("user_no") String user_no);
}
