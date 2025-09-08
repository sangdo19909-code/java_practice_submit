package com.ohgiraffers.section02;

public class A_for {
     public static void testSimpleForStatement() {
         int random = (int)(Math.random() * 100) + 1;
         int sum = 0;
         for(int i = 0; i <= random; i++) {
            sum += i;
         }
     }
}
