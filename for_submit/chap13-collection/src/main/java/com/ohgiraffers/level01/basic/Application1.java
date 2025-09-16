package com.ohgiraffers.level01.basic;

import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /*
        학생 성적 : 100
        추가 입력하려면 y : y
        학생 성적 : 95
        추가 입력하려면 y : Y
        학생 성적 : 66
        추가 입력하려면 y : y
        학생 성적 : 79
        추가 입력하려면 y : n
        학생 인원 : 4
        평균 점수 : 85.0
        */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int sum = 0;
                int count = 0;

        while(true) {
                    //점수 입력
                    System.out.println("학생 성적");
                    int score = Integer.parseInt(br.readLine());
                    sum += score;
                    count++;

                    System.out.println("추가 입력하려면 y : ");
                    String yn = br.readLine();
                    if (!yn.equalsIgnoreCase("y")) {
                        break;
                    }
        }
        System.out.println("학생 인원 : " + count);
        System.out.println("평균 점수 : " + (sum / (double)count));
    }
}