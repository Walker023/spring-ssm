package com.code.dao;

import com.code.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Insert("insert into book values(null,#{name},#{type},#{description})")
    void save(Book book);

    @Update("update book set name=#{name},type=#{type},description=#{description} where id=#{id}")
    void update(Book book);

    @Select("delete from book where id=#{id}")
    void delete(Integer id);

    @Select("select * from book where id=#{id}")
    Book getById(Integer id);

    @Select("select * from book")
    List<Book> getAll();
}
