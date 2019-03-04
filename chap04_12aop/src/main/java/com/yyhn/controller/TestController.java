package com.yyhn.controller;

import com.yyhn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/test1")
    public String test1(){
        return testService.getName();
    }
    @GetMapping("/test2")
    public Integer test2(){
        return testService.getid();
    }
}
