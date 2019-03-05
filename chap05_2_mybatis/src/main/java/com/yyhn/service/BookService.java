package com.yyhn.service;

import com.yyhn.pojo.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();
    public int addBook(Book book);
}
