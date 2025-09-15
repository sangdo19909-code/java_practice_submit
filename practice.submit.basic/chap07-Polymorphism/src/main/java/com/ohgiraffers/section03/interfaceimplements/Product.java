package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

/* 인터페이스는 다중 상속이 가능하다.
* 인터페이스가 인터페이스를 상속 받을 수 있다. 이 때는 extends 라는 키워드를 쓴다.
 * 클래스 extends 클래스                                      <- 단일 상속
 * 클래스 implements 인터페이스, 인텊이스.....                  <- 다중 상속
 * 인터페이스 extens 인터페이스, 인터페이스....                  <- 다중 상속
 * */

public class Product implements InterProduct, Serializable {

    /*InterProduct의 추상 메소드는 반드시 구혀냏야한다.*/

    @Override
    public void nonStaticMethod() {
        System.out.println("Product에서 InterProduct의 nonStaticMethod 구현");

    }

    @Override
    public void abstMethod() {

    }
    /* static 메소드는 오버라이드 할 수 없다.*/
//    @Override
//    public static void staticMethod() {}




}
