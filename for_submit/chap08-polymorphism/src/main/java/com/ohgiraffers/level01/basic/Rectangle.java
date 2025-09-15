package com.ohgiraffers.level01.basic;

public class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    public void Rectangel (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double factor) {
        width = width * 2;
        height = height * 2;
    }
}
