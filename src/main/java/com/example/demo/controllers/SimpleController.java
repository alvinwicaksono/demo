package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Value("Alvin Wicaksono")
    private String yourName;

    @Value("${master.role}")
    private String role;

    @GetMapping(value = "/")
    public String welcomeController(){
        return "Welcome";
    }

    @GetMapping(value = "/profile")
    public String profileController(){
        return "This API is created by " + yourName;
    }

    @GetMapping(value = "/role")
    public String roleController(){
        return "My Role is " + role;
    }


}
