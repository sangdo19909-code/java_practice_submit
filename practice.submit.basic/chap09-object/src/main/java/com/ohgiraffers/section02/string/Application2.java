package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String STR3 = new String("java");
        String STR4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == STR3));
        System.out.println("str3 == str4 : " + (STR3 == STR4));

        /* 값이 같은 문자열은 같은 헤시코드를 반환하도록 String 클래스에 hashCode 메소드가 
        * 재정의 되어 있다. (동등 객체 확인)*/
        System.out.println("str2.hashCode() : " + str2.hashCode());
        System.out.println("str3.hashCode() : " + str2.hashCode());
        System.out.println("str4.hashCode() : " + str2.hashCode());

        /* 문자열은 불변이라는 특성을 가진다.
        * 만약 변경하면 새로운 객체를 재할당 된다.*/
        str2 += "mariadb";
        System.out.println("str1 == str2 : " + (str1 == str2));




    }
}
