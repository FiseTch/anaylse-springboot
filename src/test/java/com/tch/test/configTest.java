package com.tch.test;

import com.tch.TestApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/10 17:43
 */
public class configTest extends TestApplicationTests {
    
    
    @Value("${test.name}")
    private String message;
    
    @Test
    public void getMessage() {
        System.out.println(message);
    }
    
}
