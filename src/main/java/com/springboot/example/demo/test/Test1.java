package com.springboot.example.demo.test;

import com.springboot.example.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: rxd
 * @Date: 2020/1/16 17:17
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService)context.getBean("userServiceImpl");
        System.out.println(userService.getUser().toString());
    }
}
