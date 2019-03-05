package com.yyhn.controller;

import com.yyhn.pojo.Book;
import com.yyhn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/findAll")
    public void findAll(){
        PageRequest pageable=PageRequest.of(2,3);
        Page<Book> page=bookService.getAll(pageable);
        System.out.println(page.getTotalPages());
        System.out.println(page.getTotalElements());
        System.out.println(page.getContent());
        System.out.println(page.getNumber());
    }
    @GetMapping("/search")
    public void search(){
        List<Book> bs1=bookService.getBookByIdAAndAuthor("鲁迅",7);
        List<Book> bs2=bookService.getBookBysAuthorStartingWith("吴");
        List<Book> bs3=bookService.getBooksByIdAndName("西",8);
        List<Book> bs4=bookService.getBooksByPriceGreaterThan(30f);
        Book b=bookService.getMaxIdBook();
        System.out.println(bs1);
        System.out.println(bs2);
        System.out.println(bs3);
        System.out.println(bs4);
        System.out.println(b);
    }
    @GetMapping("/save")
    public void save(){
        Book book=new Book();
        book.setAuthor("鲁迅");
        book.setName("呐喊");
        book.setPrice(23f);
        bookService.addBook(book);
    }
}
