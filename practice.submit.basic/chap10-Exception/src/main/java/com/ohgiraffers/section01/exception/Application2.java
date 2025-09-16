package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            /* try : 예외 발생 가능성이 있는 코드를 작성 */
            exceptionTest.checkEnoughMoney(10000, 50000);
            exceptionTest.checkEnoughMoney(50000, 10000);
        } catch (Exception e) {
            /* catch : try 블럭 안에서 예외가 발생하고 던져질 경우 catch 블럭에서 잡아서
            * 해당 블럭의 코드가 실행*/
            throw new RuntimeException("====== 상품 구입 불가 ====");
        }
        /* 예외가 발생하더라도 catch 블럭 실행 후 프로세스의 수행 흐름으로 돌아와서 정상 종료 된다.*/
        System.out.println("프로그램을 종료합니다.");
    }
}
