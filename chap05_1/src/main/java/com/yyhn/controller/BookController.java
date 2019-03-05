package com.yyhn.controller;

import com.yyhn.pojo.Book;
import com.yyhn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/addBook")
    @ResponseBody
    public String add(Book book){
        book.setName("嘿公平");
        book.setAuthorid(1);
        bookService.addBook(book);
        return "成功";
    }
}
