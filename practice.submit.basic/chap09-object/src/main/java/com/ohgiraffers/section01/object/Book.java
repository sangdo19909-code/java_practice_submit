package com.ohgiraffers.section01.object;

import java.util.Objects;

public class Book /* extends Object */{

    private int number;
    private String title;
    private String author;
    private int price;

    public Book(int i, String s, String q, int y ) {
    }

    public void setPrice(int price) {
    this.price = price;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setTitle(String title) {
    this.title = title;
}

public void setNumber(int number) {
    this.number = number;
}


public int getPrice() {
    return price;
}

public String getAuthor() {
    return author;
}

public String getTitle() {
    return title;
}

public int getNumber() {
    return number;
}

    @Override
    public boolean equals(Object o) {
        /* 비교 대상 객체가 null이거나 다른 타입일 경우 비교 가치가 없으므로 false 변환 */
        if (o == null || getClass() != o.getClass()) return false;
        /* book 타입으로 다운캐스팅 해야 필드 값에 접근해서 비교 가능 */
        Book book = (Book) o;
        /* 기본 자료형은 == 를 통해 값 비교, 참조 자료형은 equals를 통해 동등성 비교
        * 모든 필드 값이 같으면 동등 객체라고 판단하여 true 변환 */
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        /* 같은 필드 값이 hash 연산에 쓰이면 hash 연산의 결과도 같은 값이 나온다. */
        return Objects.hash(number, title, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}