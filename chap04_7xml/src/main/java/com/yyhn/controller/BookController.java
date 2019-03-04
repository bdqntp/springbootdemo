package com.yyhn.controller;

import com.yyhn.pojo.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    book b;
    @GetMapping("/book")
    public String book(){
        b.setId(1);
        b.setName("123");
        return b.toString();
    }
}
