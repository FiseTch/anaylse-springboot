package com.tch.responsity;

import com.tch.domain.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/16 10:14
 */
public interface MessageRepository extends JpaRepository<UserMessage,Integer> {
}
