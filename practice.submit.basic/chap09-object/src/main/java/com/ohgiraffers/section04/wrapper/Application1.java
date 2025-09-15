package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다. */
        int num = 10;
        Integer num1 = new Integer(num);


        Integer num1 = Integer.valueOf(num);
        Integer num2 = num;

        /* UnBoxing : Integer -> int */
        int num3 = num2.intValue();
        int num4 = num3;

    }
}
