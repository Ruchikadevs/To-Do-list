package com.example.To_do.list.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController{
    @GetMapping("/hello")
    public String hello(){
        return "Hello Students! How are you doing?";
    }
}

