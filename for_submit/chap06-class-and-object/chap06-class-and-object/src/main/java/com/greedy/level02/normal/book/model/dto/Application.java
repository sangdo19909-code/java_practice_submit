package com.greedy.level02.normal.book.model.dto;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {

        BookDTO b1 = new BookDTO();
        b1.printlnformation();

        BookDTO b2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        b2.printlnformation();

        BookDTO b3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        b3.printlnformation();
    }
}
