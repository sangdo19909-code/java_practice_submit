package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근이 가능한 경우 발생하는 문제점을 이해한다.
        *  => 개발자가 실수로 음수로 hp를 설정하는 문제*/
        Monster m1 = new Monster();
        m1.name = "두치";
        m1.hp = 200;
        System.out.println(m1.name);
        System.out.println(m1.hp);

        Monster m2 = new Monster();
        m2.name = "뿌꾸";
        m2.hp = -200;
        System.out.println(m2.name);
        System.out.println(m2.hp);

        Monster m3 = new Monster();
        m3.name = "드라큘라";
        m3.hp = -100;
        m3.setHp(-100);
        System.out.println(m2.name);
        System.out.println(m2.hp);
    }
}
