package com.yyhn.mapper;

import com.yyhn.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface BookMapper {
    public List<Book> getBookList();
    public int addBook(Book book);
}
