package com.ohgiraffers.section02.interemdiate;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        /* 스트림의 중간 연산, 중계 연산 중 하나만 filter에 대해 이해*/
        IntStream intStream = IntStream.range(0, 10);
        intStream.filter(i -> i % 2 ==0).forEach(System.out::println);



    }



}
