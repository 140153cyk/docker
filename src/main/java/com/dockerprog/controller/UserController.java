package com.dockerprog.controller;

import com.dockerprog.dao.UserMapper;
import com.dockerprog.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/name")
    public User findUserByName(String name){
        return userMapper.findUserByName(name);
    }
}
