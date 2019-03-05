package com.yyhn.controller;

import com.yyhn.pojo.Book;
import com.yyhn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/show")
    public String show(){
        List<Book> books=bookService.getBookList();
        StringBuffer str=new StringBuffer();
        for (Book book:books){
            str.append(book.toString());
        }
        return str.toString();
    }
    @GetMapping("/add")
    public String add(){
        Book book=new Book();
        book.setName("aaali");
        book.setAuthorid(22);
        bookService.addBook(book);
        return "成功";
    }
}
