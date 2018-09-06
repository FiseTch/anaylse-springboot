package com.tch.responsity;

import com.tch.domain.UserImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/14 16:11
 */
public interface UserRepository extends JpaRepository<UserImpl,Integer> {

}
