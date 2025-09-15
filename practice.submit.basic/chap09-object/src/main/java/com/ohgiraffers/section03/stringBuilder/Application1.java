package com.ohgiraffers.section03.stringBuilder;

public class Application1 {
    public static void main(String[] args) {
        /* string : 불변 객체, stringBuilder : 가변 객체*/
        StringBuilder sb = new StringBuilder("java"); {
            /* StringBuilder에도 toString이 오버라이딩 되어 관리되는 문자열을 반환해준다.*/
            System.out.println(sb);
            /* Object의 hashCode 반환 => .*/



        }
    }
}
