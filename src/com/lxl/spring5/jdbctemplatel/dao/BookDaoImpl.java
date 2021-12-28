package com.lxl.spring5.jdbctemplatel.dao;

import com.lxl.spring5.jdbctemplatel.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        String sql = "insert into book values(?,?,?) ";
        String args[] = {book.getBookId(), book.getBookName(), book.getBookStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("更新了" + update + "条数据");
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update book set bookname=?,bookstatus=? where bookid=?";
        Object[] args = {book.getBookName(), book.getBookStatus(), book.getBookId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from book where bookid=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    //查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询单个对象
    @Override
    public Book selectOneBook(String bookid) {
        String sql = "select * from book where bookid=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), bookid);
        return book;
    }

    //查询多个对象
    @Override
    public List<Book> selectAllBooks() {
        String sql = "select * from book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchInsert(List<Object[]> books) {
        String sql = "insert into book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);
        System.out.println(Arrays.toString(ints));
    }
//批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update book set bookname=?,bookstatus=? where bookid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

//    批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from book where bookid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}