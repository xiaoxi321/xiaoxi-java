package com.springboot.example.demo.controller;

import com.springboot.example.demo.dto.User;
import com.springboot.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: rxd
 * @Date: 2020/1/14 14:36
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }
}
