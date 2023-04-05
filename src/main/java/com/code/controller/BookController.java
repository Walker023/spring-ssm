package com.code.controller;

import com.code.domain.Book;
import com.code.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SUCCESS : Code.ERROR,flag,"保存成功");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.SUCCESS : Code.ERROR,flag,"更新成功");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.SUCCESS : Code.ERROR,flag,"删除成功");
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        String msg = book != null ? "查询成功" : "查询失败";
        return new Result(book != null ? Code.SUCCESS : Code.ERROR,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        String msg = books != null && books.size() > 0 ? "查询成功" : "查询失败";
        return new Result(books != null && books.size() > 0 ? Code.SUCCESS : Code.ERROR,books,msg);
    }
}
