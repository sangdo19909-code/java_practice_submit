package com.ohgiraffers.section02.interemdiate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 중계연산 중 하나인 Mapd에 대해 이해
        * */

        IntStream intStream = IntStream.range(0, 10);
        intStream.filter(i -> i % 2 == 0).map(i -> i * 10).forEach(System.out::println);

    }
}
