package com.tch.test;

import com.tch.TestApplicationTests;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/11 10:23
 */
public class MockTest extends TestApplicationTests {
    
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;
    
    @Before
    public void setUp(){
        mvc = MockMvcBuilders.webAppContextSetup(context).build();  //构造MockMvc
        
    }
    
    @Test
    public void signOutCurrentClass() throws Exception {
        mvc.perform(post("/index") // //调用接口
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("userId", "11").param("userName", "henry")//传入添加的用户参数
                
                .accept(MediaType.APPLICATION_JSON))  //接收的类型
                .andExpect(status().isOk())   //判断接收到的状态是否是200
                .andDo(print())  //打印内容
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(content().string(Matchers.containsString("OK"))) //匹配返回值中的内容
                .andExpect(MockMvcResultMatchers.jsonPath("$.errcode", is(0)));////使用jsonPath解析返回值，判断具体的内容
        
    }
    
}
