package com.tch.controller;

import com.tch.domain.UserMessageImpl;
import com.tch.domain.security.UserImpl;
import com.tch.responsity.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/14 15:53
 */
@Api("用户信息管理")
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;
    

    @ApiOperation(value = "用户登陆", httpMethod = "POST")
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        ModelAndView mv = new ModelAndView("pre_login");
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        UserImpl user = userRepository.getUserByUsername(username.trim());
        if(user.getPassword().equals(password.trim())) {
            session.setAttribute("user", user);
            mv.setViewName("login");
        }
        return mv;
    }
    
    
    @ApiOperation(value = "用户点赞",httpMethod = "POST")
    @RequestMapping("/addMessage")
    public ModelAndView addMessage(){
        ModelAndView mv = new ModelAndView();
        UserMessageImpl userMessage = UserMessageImpl.builder().messageId("1").build();
        userMessage.addMessage();
        return mv;
    }

}
