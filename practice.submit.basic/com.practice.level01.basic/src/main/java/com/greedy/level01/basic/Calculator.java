package com.greedy.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    };

    public int sum1to10(){                      // 메서드 호출
        int sum = 0;                            //
        for (int i = 1; i <= 10; i++) {
            sum += +i;
        };
      ; return sum;
    }

    public void cehckMaxNumber(int a, int b) {
       int sumNumber = Math.max(a, b);
        System.out.println("두 수 중 큰 수는 " + sumNumber + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int minusTwoNumber(int a, int b) {
        int sum1 = a - b;
        return sum1;
    }

}
