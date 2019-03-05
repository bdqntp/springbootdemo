package com.yyhn.service;

import com.yyhn.dao.BookDao;
import com.yyhn.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    public void addBook(Book book){
        bookDao.save(book);
    }
    public Page<Book> getAll(Pageable pageable){
        return bookDao.findAll(pageable);
    }
    public List<Book> getBookBysAuthorStartingWith(String author){
        return bookDao.getBooksByAuthorStartingWith(author);
    }
    public List<Book> getBooksByPriceGreaterThan(Float price){
        return bookDao.getBooksByPriceGreaterThan(price);
    }
    public Book getMaxIdBook(){
        return bookDao.getMaxIdBook();
    }
    public List<Book> getBookByIdAAndAuthor(@Param("author")String author, @Param("id")Integer id){
        return bookDao.getBookByIdAAndAuthor(author, id);
    }
    public  List<Book> getBooksByIdAndName(String name,Integer id){
        return bookDao.getBooksByIdAndName(name, id);
    }
}
