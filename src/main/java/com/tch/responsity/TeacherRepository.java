package com.tch.responsity;

import com.tch.domain.TeacherImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 17:24
 */
public interface TeacherRepository extends JpaRepository<TeacherImpl,Integer> {
}
