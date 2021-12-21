package com.lxl.spring5;


/**
 * @author Administrator
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;


    //set方法进行注入属性
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
//有参构造方法进行注入属性
//    public Book(String bname) {
//        this.bname = bname;
//    }


//    public static void main(String[] args) {

//        set方法进行注入属性
//        Book bookset = new Book();
//        bookset.setBauthor("me");

//        有参构造方法进行注入属性
//        Book book = new Book("Java宝典");
//    }

    public void ShowBook(){
        System.out.println(bname+":"+bauthor);
    }
}
