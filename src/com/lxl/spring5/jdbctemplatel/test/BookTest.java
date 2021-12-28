package com.lxl.spring5.jdbctemplatel.test;

import com.lxl.spring5.jdbctemplatel.entity.Book;
import com.lxl.spring5.jdbctemplatel.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    @Test
    public void jdbcTemplateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate1.xml");
//        增加
//        Book book = new Book();
//        BookService bookService = context.getBean("bookService", BookService.class);
//        book.setBookId("1");
//        book.setBookName("Java宝典");
//        book.setBookStatus("完好");
//        bookService.addBook(book);

//        修改，无值改为null
//        Book book = new Book();
//        BookService bookService = context.getBean("bookService", BookService.class);
//        book.setBookId("1");
//        book.setBookStatus("改了");
//        bookService.updateBook(book);

//      根据id删除
//        BookService bookService = context.getBean("bookService", BookService.class);
//        bookService.delete("1");

//      查询数目
//        BookService bookService = context.getBean("bookService", BookService.class);
//        int i = bookService.selectCount();
//        System.out.println(i);

//      查询单个对象
//        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = bookService.selectOneBook("1");
//        System.out.println(book);

//        查询一组对象
//        BookService bookService = context.getBean("bookService", BookService.class);
//        List<Book> book = bookService.selectAllBooks();
//        System.out.println(book);

//       批量新增一组对象
//        BookService bookService = context.getBean("bookService", BookService.class);
//        List<Object[]> books = new ArrayList<>();
//        Object[] o1={"3","java","a"};
//        Object[] o2={"4","orcle","b"};
//        Object[] o3={"5","net","v"};
//        books.add(o1);
//        books.add(o2);
//        books.add(o3);
//        bookService.batchInsert(books);

//            批量修改
//        BookService bookService = context.getBean("bookService", BookService.class);
//        List<Object[]> batchArgs = new ArrayList<>();
////        sql参数顺序
//        Object[] o1 = {"java1", "a3", "3"};
//        Object[] o2 = {"orcle1", "b4", "4"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
////        调用方法实现批量修改
//        bookService.batchUpdateBook(batchArgs);

        //批量删除
        BookService bookService = context.getBean("bookService", BookService.class);
         List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用方法实现批量删除
         bookService.batchDeleteBook(batchArgs);

    }

}
