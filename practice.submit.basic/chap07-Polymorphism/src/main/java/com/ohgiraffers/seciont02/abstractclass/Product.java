package com.ohgiraffers.seciont02.abstractclass;

/*추상 클래스를 선언 : abstract  */
public abstract class Product {

    private int nonStaticField;
    private static int staticFiedl;

    public Product() {}


    /* 추상 클래스는 일반적인 메소드를 가질 수 있다.*/
    public void nonStaticMethod() {
        System.out.println("Product의 nonStaticMethod");
    }

    /* 추상 메소드 (미완성 메소드) 작성
    * 추상 메소드가 선언 된 경우 반드시 클래스에 abstract 키워드를 붙여 추상 클래스로 선언 해야함
    * 추상 메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 붙여 추상 클래스로 만들 수 있음 */
//    public abstract void absMathod();



}
