package com.tch.test;

import com.tch.TestApplicationTests;
import com.tch.domain.TeacherImpl;
import com.tch.responsity.TeacherRepository;
import com.tch.service.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/7 11:01
 */
public class teacherTest extends TestApplicationTests {
    
    @Autowired
    private TeacherRepository teacher;
    
    @Test
    public void getAllId() {
        TeacherImpl name = TeacherImpl.builder().id("test").password("12").name("tong").build();
        teacher.saveAndFlush(name);
        List<String> allTeacId = teacher.getAllTeacId();
        for (String id : allTeacId) {
            System.out.println(id);
        }
    }
}
