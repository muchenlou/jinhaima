package com.jinhaima.controller;

import com.jinhaima.entity.User;
import com.jinhaima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

//    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

}
