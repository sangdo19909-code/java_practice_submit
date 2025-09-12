package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        Animal a1 = new Rabbit();
        Animal a2= new Tiger();


        /* 자식타입의 레퍼런스 변수는 부모타입의 인스턴스를 참조할 수 없다.
         */

        a1.cry();
        a2.cry();

        // 정적으로 판단하고 동적으로 실행 하기떄문에 실행할수 없다.
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();
        //형변환하면 가능하다.
    }
}
