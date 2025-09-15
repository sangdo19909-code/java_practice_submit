package com.ohgiraffers.seciont02.abstractclass;

public class SmartPhone extends Product {
    /* 추상 클래스를 상속 받는 경우 추상 메소드를 반드시 오버라이딩해서 완성해야 한다는
    * 강제가 생긴다. (또는 본인도 추상 클래스가 되어야 한다. */
    @Override
    public void abstactMethod() {
        System.out.println("SmartPhone에서 abstMathod 오버라이딩");
    }
    public void printSmartPhone() {
        System.out.println("SmartPhone의 print 메소드 호출");
    }


}
