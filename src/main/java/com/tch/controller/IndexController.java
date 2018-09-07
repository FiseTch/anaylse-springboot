package com.tch.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/17 9:29
 */
@Api
@Controller
@Slf4j
@RequestMapping
public class IndexController {
    
    @ApiOperation(value = "系统更新", httpMethod = "POST")
    @RequestMapping("/index")
    public String analyse() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        
        return "index";
    }
    
    
    @ApiOperation(value = "系统登陆页面", httpMethod = "POST")
    @RequestMapping("/login_pre")
    public String preLogin() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
    
        return "pre_login";
    }
    
    @ApiOperation(value = "我的", httpMethod = "POST")
    @RequestMapping(value = "/myPage")
    public String myPage() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        
        return "myPage";
    }
    
    @ApiOperation(value = "闲言碎语", httpMethod = "POST")
    @RequestMapping(value = "/killTime")
    public String killTime() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        
        return "killTime";
    }
    
    @ApiOperation(value = "我的好友", httpMethod = "POST")
    @RequestMapping(value = "/friend")
    public String friend() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        
        return "friend";
    }
    
    @ApiOperation(value = "主页", httpMethod = "POST")
    @RequestMapping("/homePage")
    public String homePage() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        
        return "homePage";
    }
}
