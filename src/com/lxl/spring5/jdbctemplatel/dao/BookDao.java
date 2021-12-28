package com.lxl.spring5.jdbctemplatel.dao;

import com.lxl.spring5.jdbctemplatel.entity.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);
    public void delete(String id);
    public void updateBook(Book book);
    public int selectCount();
    public Book selectOneBook(String bookid);
    public List<Book> selectAllBooks();
    public void batchInsert(List<Object[]> books);
    public void batchUpdateBook(List<Object[]> batchArgs);
    public void batchDeleteBook(List<Object[]> batchArgs);
}
