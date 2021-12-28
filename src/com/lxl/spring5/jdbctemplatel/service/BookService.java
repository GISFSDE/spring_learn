package com.lxl.spring5.jdbctemplatel.service;

import com.lxl.spring5.jdbctemplatel.dao.BookDao;
import com.lxl.spring5.jdbctemplatel.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService { //注入dao
    @Autowired
    private BookDao bookDao;
    public void addBook(Book book){
        bookDao.add(book);
    }
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    public void delete(String id){
        bookDao.delete(id);
    }
    public int selectCount(){
       return bookDao.selectCount();
    }
    public Book selectOneBook(String bookid){
        return bookDao.selectOneBook(bookid);
    }
    public List<Book> selectAllBooks(){
        return bookDao.selectAllBooks();
    }

    public void batchInsert(List<Object[]> books){
        bookDao.batchInsert(books);
    };
    public void batchUpdateBook(List<Object[]> books){
        bookDao.batchUpdateBook(books);
    };
    public void batchDeleteBook(List<Object[]> books){
        bookDao.batchDeleteBook(books);
    };
}
