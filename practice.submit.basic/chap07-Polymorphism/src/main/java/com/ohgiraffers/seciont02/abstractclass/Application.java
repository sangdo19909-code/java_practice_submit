package com.ohgiraffers.seciont02.abstractclass;

import jdk.swing.interop.SwingInterOpUtils;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메소드에 대해 이해 */


        /* 추상 클래스는 인스턴스화 할 수 없으며 추상 클래스를 상속 받아 완성한
        * 자식 클래스만 인스턴스화 가능하다.*/
//        Product product = new Product() {};
        SmartPhone smartPhone = new SmartPhone();

        /* 다형성을 적용하여 추상 클래스를 래퍼런스 타입으로 사용 */
        Product product = new SmartPhone();
        System.out.println(product instanceof product);
        System.out.println(smartPhone instanceof smartPhone);

        Product product = new SmartPhone();
        product.abstMethod(); //동적 바인딩

        /* 일반적인 메소드도 호출 가능하다. */
        product.nonStaticMethod();
        product.hashCode();

    }
}
