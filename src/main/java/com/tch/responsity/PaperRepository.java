package com.tch.responsity;

import com.tch.domain.PaperImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 17:24
 */
public interface PaperRepository extends JpaRepository<PaperImpl, Integer> {
}
