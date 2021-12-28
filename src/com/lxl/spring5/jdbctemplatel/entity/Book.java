package com.lxl.spring5.jdbctemplatel.entity;

public class Book {
    private String BookId;
    private String BookName;
    private String BookStatus;

    @Override
    public String toString() {
        return "Book{" +
                "BookId='" + BookId + '\'' +
                ", BookName='" + BookName + '\'' +
                ", BookStatus='" + BookStatus + '\'' +
                '}';
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookStatus() {
        return BookStatus;
    }

    public void setBookStatus(String bookStatus) {
        BookStatus = bookStatus;
    }
}
