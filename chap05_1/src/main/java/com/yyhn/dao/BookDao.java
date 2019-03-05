package com.yyhn.dao;

import com.yyhn.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public  int addBook(Book book){
        return jdbcTemplate.update("InSERT  `book`(`name`,`authorid`)VALUES(?,?)"
                ,book.getName(),book.getAuthorid());
    }
    public int updateBook(Book book){
        return jdbcTemplate.update("UPDATE `book` SET `name`=?,`authorid`=? WHERE `id`=?",book.getName()
        ,book.getAuthorid(),book.getId());
    }
    public int deleteBook(Integer id){
        return jdbcTemplate.update("DELETE FROM `book` WHERE `id`=?",id);
    }
    public Book getBookById(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM BOOK WHERE ID=?",new BeanPropertyRowMapper<>(Book.class),
                id);
    }
    public List<Book> getBookList(){
        return jdbcTemplate.query("SELECT * FROM BOOK",new BeanPropertyRowMapper<>(Book.class));
    }
}
