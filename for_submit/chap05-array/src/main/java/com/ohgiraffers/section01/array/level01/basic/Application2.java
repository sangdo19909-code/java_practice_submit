package com.ohgiraffers.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        String[] arr1 = {"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요. : ");
        int num = sc.nextInt();

        if (0 <= num && num < arr1.length) {
            System.out.println(arr1[num]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }

            /* 해당 정수의 인덱스에 있는 과일을 출력하세요
             *
             * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
             *
             * -- 입력 예시 --
             * 0부터 4까지의 정수를 입력하세요 : 2
             *
             * -- 출력 예시 --
             * 복숭아
             *
             * -- 입력 예시 --
             * 0부터 4까지의 정수를 입력하세요 : 5
             *
             * -- 출력 예시 --
             * 준비된 과일이 없습니다.
             * */

        }
    }
