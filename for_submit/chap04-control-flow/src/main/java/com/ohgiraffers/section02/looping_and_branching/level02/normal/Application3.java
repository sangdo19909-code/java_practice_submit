package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 정수를 입력받아 1부터 입력받은 정수까지 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("수");
            } else {
                System.out.print("박");
            }
        }
    }
}