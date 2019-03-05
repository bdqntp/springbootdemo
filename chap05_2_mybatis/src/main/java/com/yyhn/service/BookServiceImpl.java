package com.yyhn.service;

import com.yyhn.mapper.BookMapper;
import com.yyhn.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
}
