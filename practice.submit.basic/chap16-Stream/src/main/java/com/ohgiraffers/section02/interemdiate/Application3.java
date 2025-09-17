package com.ohgiraffers.section02.interemdiate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("java", "Spring", "Spring Boot"),
                Arrays.asList("JAVA", "SPRING", "SPRING BOOT")
        );

        System.out.println(list);

        List<String> flatList = list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println(flatList);
    }
}
