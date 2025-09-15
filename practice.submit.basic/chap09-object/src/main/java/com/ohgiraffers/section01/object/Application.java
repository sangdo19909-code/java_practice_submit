package com.ohgiraffers.section01.object;

public class Application {
    public static void main(String[] args) {
        /* Object 클래스의 주요 메소드를 오버라이딩 해서 사용할 수 있다. */

        Book b1 = new Book(1,"홍길동전", "허준", 50000);
        Book b2 = new Book(1,"홍길동전", "허균", 50000);
        Book b3 = new Book(1,"홍길동전", "허균", 60000);



        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book b4 = new Book(4, "혼공자", "저자", 30000);
        Book b5 = new Book(4, "혼공자", "저자", 30000);

        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());

        System.out.println(b4 == b5);
        System.out.println(b4.equals(b5));

        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());
    }
}
