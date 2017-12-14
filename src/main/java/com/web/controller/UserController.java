package com.web.controller;

import com.web.model.User;
import com.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lj on 2017/12/14.
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
   @RequestMapping("user/{id}")
    public User getUser(@PathVariable String id){
       return userService.getUser(id);
   }
}
