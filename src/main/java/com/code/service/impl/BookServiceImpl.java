package com.code.service.impl;

import com.code.controller.Code;
import com.code.dao.BookDao;
import com.code.domain.Book;
import com.code.exception.BusinessException;
import com.code.exception.SystemException;
import com.code.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        if(id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR,"id不能为1");
        }
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
