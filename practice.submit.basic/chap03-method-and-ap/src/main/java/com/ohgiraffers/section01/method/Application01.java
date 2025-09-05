package com.ohgiraffers.section01.method;

import java.sql.SQLOutput;

public class Application01 {

    public static void main(String[] args) {
        /* 메소드의 호출 흐름에 대해 이해 할 수 있다. */
        System.out.println("main 호출");

        /* 별도로 정의한 메소드를 호출하는 방법. */
        Application01 application1 = new Application01();
        application1.methodA();
        application1.methodB();
        application1.methodC();
        application1.methodA(); // 필요하다면 정의 된 메소드를 재사용

    }
    /* 별도의 메소드를 정의한다.
     *접근제한자 반환형 메소드명 (매개변수){} */
    public void methodA() {
        System.out.println("methodA 호출");
        System.out.println("methodA 종료");
    }

    public void methodB() {
        System.out.println("methodB 호출");
        System.out.println("methodB 종료");
    }

    public void methodC() {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");

        System.out.println("main 종료");
    }
}