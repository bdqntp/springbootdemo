package com.yyhn.controller;

import com.yyhn.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookControllerJdbc {
    @Resource(name="jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;
    @Autowired
    @Qualifier("jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;
    @GetMapping("test")
    public void test(){
        List<Book> book1=jdbcTemplateOne.query("select * from book",new BeanPropertyRowMapper<>(Book.class));
        List<Book> book2=jdbcTemplateTwo.query("select * from book",new BeanPropertyRowMapper<>(Book.class));
        System.out.println(book1.toString()+book2.toString());
    }
}
