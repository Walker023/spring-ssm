package com.code.service;

import com.code.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存图书
     * @param book
     * @return 保存成功返回true，否则返回false
     */
    boolean save(Book book);

    /**
     * 更新图书
     * @param book
     * @return 更新成功返回true，否则返回false
     */
    boolean update(Book book);

    /**
     * 删除图书
     * @param id
     * @return 删除成功返回true，否则返回false
     */
    boolean delete(Integer id);

    /**
     * 根据id查询图书
     * @param id
     * @return 返回查询到的图书，如果没有查询到则返回null
     */
    Book getById(Integer id);

    /**
     * 查询所有图书
     * @return 返回所有图书的集合，如果没有查询到则返回空集合
     */
    List<Book> getAll();
}
