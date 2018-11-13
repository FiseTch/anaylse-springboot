package com.tch.test;

import com.tch.TestApplicationTests;
import com.tch.domain.security.UserImpl;
import com.tch.responsity.UserRepository;
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
    private UserRepository teacher;
    
    @Test
    public void getAllId() {
        UserImpl name = UserImpl.builder().userNo("10").password("12").username("tong").build();
        teacher.saveAndFlush(name);
        List<String> allUserId = teacher.getAllUserId();
        for (String id : allUserId) {
            System.out.println(id);
        }
    }
}
