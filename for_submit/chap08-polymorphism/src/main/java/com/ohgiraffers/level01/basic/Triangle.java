package com.ohgiraffers.level01.basic;

public class Triangle extends Shape implements Resizable {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public void Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return (double)((Math.pow(base, 2) + (Math.pow(height, 2))));
    }

    @Override
    public double calculatePerimeter() {
        return (double)(side1 + side2 + side3);
    }

    @Override
    public void Triangle(double factor) {
        base = base * 2;
        height = height * 2;
        side1 = side1 * 2;
        side2 = side2 * 2;
        side3 = side3 * 2;

    }


}
