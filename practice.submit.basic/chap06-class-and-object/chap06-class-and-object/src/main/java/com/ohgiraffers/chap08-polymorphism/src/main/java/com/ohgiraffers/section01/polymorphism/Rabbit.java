package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("깡총깡총");
    }

    @Override
    public void cry() {
        System.out.println("끼끼끼끾");
    }


    public void jump() {
        System.out.println("토끼 점프");
    }
}
