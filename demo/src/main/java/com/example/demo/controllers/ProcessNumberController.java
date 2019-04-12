package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessNumber {
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
