package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/signup", method = POST)
    @ResponseBody
    public ResponseEntity<String> userSignup(User user) {
        userService.addUser(user);
        return new ResponseEntity<>("Successfully Created User", HttpStatus.CREATED);
    }
}
