package com.yyhn.mapper2;

import com.yyhn.pojo.Book;

import java.util.List;


public interface BookMapper {
    public List<Book> getBookList();
    public int addBook(Book book);
}
