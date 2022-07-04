package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/world")
public class HttpController {

    @Value("user")
    private String name;

    @Value("${master.user.name}")
    private String userName;

    @GetMapping(value = "/userName")
    public String userNameController(){
        return userName;
    }

    @GetMapping(value = "/user")
    public String userController(){
        return name;
    }

    @GetMapping(value = "/hello")
    public String helloController() {
        return "Hello";
    }
}
