package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고*/
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수인 양의 정수를 입력하세요. : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        if ((num <= 0) || (num % 2) == 0) {                              //양수와 짝수를 제외한다.
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
            return;                                                 //main으로 리턴한다.
        } else {
            for (int i = 0; i < num; i++) {                         //입력받은 정수의 반까지 더한다.
                if (i <= num / 2) {
                    arr[i] = i + 1;
                } else {
                    arr[i] = num - i;
                }
                System.out.print(arr[i] + " ");
            }
        }




            /* 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
             * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
             *
             * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
             *
             * -- 입력 예시 --
             * 홀수인 양의 정수를 입력하세요 : 7
             *
             * -- 출력 예시 --
             * 1 2 3 4 3 2 1
             *
             * -- 입력 예시 --
             * 홀수인 양의 정수를 입력하세요 : 8
             *
             * -- 출력 예시 --
             * 양수 혹은 홀수만 입력해야 합니다.
             */


        }
    }
