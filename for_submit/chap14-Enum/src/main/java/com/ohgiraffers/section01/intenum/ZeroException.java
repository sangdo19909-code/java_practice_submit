package com.ohgiraffers.section01.intenum;

import java.io.IOException;

public class ZeroException extends IOException {
    public ZeroException(String message) {

    }
}
public class Calculator  {
    public double divide(double a, double b)
    { //나눌 수 b가 0일 경우 ZeroException 발생시키는 소스 작성함
    }
}


public class Exam29{
    public static void main(String[] args){
        //divide() 메소드 사용과 관련된 예외처리 코드 작성함, throws 하지 말 것.
        System.out.println(new Calculator().divide(12.5, 0));
    }
}





}
