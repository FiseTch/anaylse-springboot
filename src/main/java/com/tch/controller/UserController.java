package com.tch.controller;

import com.tch.responsity.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


    @ApiOperation(value = "用户录入入口", httpMethod = "POST")
    @RequestMapping("/index")
    public String userEntrance() {
        log.info("当前执行方法：*" + Thread.currentThread().getStackTrace()[1].getMethodName());
        return "user";
    }


}
