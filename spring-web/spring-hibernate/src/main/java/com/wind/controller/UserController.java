package com.wind.controller;

import com.wind.entity.User;
import com.wind.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get")
    public User get()
    {
        User user=userService.selectByPrimaryKey("1");
        return user;
    }
}
