package com.ohgiraffers.section03.interfaceimplements;

public class Applicaiton {
    public static void main(String[] args) {
        /* 인터페이스에 대해 이해하고 활용할 수 있다.


        /* 인터페이스는 인스턴스화 불가 */
//        InterProduct interProduct = new InterProduct() {}


        InterProduct interProduct = new Product();

        /* 오버라이딩 된 메소드 호출 */
        interProduct.abstMethod();
        interProduct.nonStaticMethod();

        /* default 메소드 호출*/
        interProduct.defaultMethod();

        /* static 메소드 호출 */
        InterProduct.staticMethod();

        /*상수 필드 접근 */



    }
}
