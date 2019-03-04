package com.yyhn.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String getName(){
        return "hello" ;
    }
    public Integer getid(){
        Integer i=Integer.parseInt("abc");
        return 1;
    }

}
