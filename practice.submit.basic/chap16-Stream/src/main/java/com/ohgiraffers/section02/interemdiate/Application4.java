package com.ohgiraffers.section02.interemdiate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.of(5, 10, 99, 7, 1, 50)
                .boxed()
                .sorted()
                .toList();
        System.out.println(integerList);



    }
}
