package com.example.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class hello {

    @RequestMapping("/hello")
    public String helloword(){
        System.out.println("hell23o");
        return "hello1";
    }
}
