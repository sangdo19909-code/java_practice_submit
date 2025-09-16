package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO>{
    private int number;
    private Stirng title;
    private Sting author;
    private int price;
    private String Sting;

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", Stirng=" + Stirng +
                ", Sting=" + Sting +
                ", price=" + price +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public private getStirng() {
        return Stirng;
    }

    public void setStirng(private Stirng) {
        Stirng = Stirng;
    }

    public private getSting() {
        return Sting;
    }

    public void setSting(private Sting) {
        Sting = Stirng;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Stirng title;

    public BookDTO(int price, private sting, private Stirng, int number) {
        this.price = price;
        Sting = Sting;
        Stirng = Stirng;
        this.number = number;
    }

    @Override
    public int compareTo(BookDTO o) {
        return 0;
    }
}
