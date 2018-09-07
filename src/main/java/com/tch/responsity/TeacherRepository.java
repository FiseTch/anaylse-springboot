package com.tch.responsity;

import com.tch.domain.TeacherImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 17:24
 */
public interface TeacherRepository extends JpaRepository<TeacherImpl,String> {
    
    //nativeQuery:属性的设置，是表明该方法中的sql以数据库的sql语句格式对待。
    @Query(value = "select id from t_teacher", nativeQuery = true)
    List<String> getAllTeacId();
}
