package com.tch.responsity;

import com.tch.domain.DegreeStaticImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 17:24
 */
public interface DegreeStaticRepository extends JpaRepository<DegreeStaticImpl,Integer> {
}
