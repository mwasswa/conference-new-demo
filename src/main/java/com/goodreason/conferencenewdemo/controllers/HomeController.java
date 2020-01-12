package com.goodreason.conferencenewdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    @RequestMapping("/")
    public String home(){
        return "My first Spring Boot application";
    }
}
