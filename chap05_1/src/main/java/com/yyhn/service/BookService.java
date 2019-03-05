package com.yyhn.service;

import com.yyhn.pojo.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public interface BookService {
    public  int addBook(Book book);
    public int updateBook(Book book);
    public int deleteBook(Integer id);
    public Book getBookById(Integer id);
    public List<Book> getBookList();
}
