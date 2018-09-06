package com.tch.responsity;

import com.tch.domain.UserSchoolImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/16 10:15
 */
public interface SchoolRepository extends JpaRepository<UserSchoolImpl,Integer> {
}
