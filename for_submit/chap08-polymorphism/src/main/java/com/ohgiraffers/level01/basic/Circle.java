package com.ohgiraffers.level01.basic;

public class Circle extends Shape implements Resizable {
    private double radius;

    public void Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea () {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter () {
        return Math.PI * (radius * 2);
    }

    @Override
    public void resize(double factor) {
        radius = radius * 2;
    }

}

