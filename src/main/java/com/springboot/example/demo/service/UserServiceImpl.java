package com.springboot.example.demo.service;

import com.springboot.example.demo.dto.User;
import org.springframework.stereotype.Service;

/**
 * @Auther: rxd
 * @Date: 2020/1/14 14:45
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User(22,"xiaoxi");
    }
}
