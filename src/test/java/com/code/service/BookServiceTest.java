package com.code.service;

import com.code.config.SpringConfig;
import com.code.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void getById() {
        System.out.println(bookService.getById(1));
    }

    @Test
    public void getAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    public void save() {
        Book book = new Book();
        book.setName("Java");
        book.setType("技术类");
        book.setDescription("Java是一种面向对象的编程语言");
        System.out.println(bookService.save(book));
    }

    @Test
    public void update() {
        Book book = new Book();
        book.setId(10);
        book.setName("Java");
        book.setType("技术类");
        book.setDescription("Java是一种面向对象的编程语言");
        System.out.println(bookService.update(book));
    }

    @Test
    public void delete() {
        System.out.println(bookService.delete(11));
    }
}
