package com.yyhn;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class controller {
    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:8081"
    ,maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        return "receiver:"+name;
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:8081"
    ,maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        return String.valueOf(id);
    }
}
