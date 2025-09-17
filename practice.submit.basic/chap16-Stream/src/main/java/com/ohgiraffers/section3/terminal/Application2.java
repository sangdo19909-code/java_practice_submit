package com.ohgiraffers.section3.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        OptionalInt redueceOneParam =
                IntStream.rangeClosed(1, 10)
                .reduce((a, b) -> {
                    System.out.println("a : " + a + "b : " + b);
                    return Integer.sum(a, b);
                });
        System.out.println("reduceOneParam : " + redueceOneParam);


    }
}
