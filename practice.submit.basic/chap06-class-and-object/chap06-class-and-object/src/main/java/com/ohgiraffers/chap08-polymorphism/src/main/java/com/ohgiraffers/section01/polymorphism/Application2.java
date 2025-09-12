package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리 할 수 있다.*/
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for(Animal animal : animals) {
            /* 동적 바인딩*/
            animal.eat();

            /* 각 인스턴스 별 고유 메소드 동작(jump or bite)*/
            if(animal instanceof Rabbit)
            if(animal instanceof Rabbit) ((Rabbit) animal).jump();
            if(animal instanceof Tiger) ((Tiger) animal).bite();


        }
    }
}
