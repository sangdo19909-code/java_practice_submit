package com.ohgiraffers.section03.map;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap */
        HashMap map = new HashMap();

        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33, 123);
        /* 저장 순서와 무관하게 저장 되어 있다.*/
        System.out.println("map : " + map);

        HashMap<String, String> hamp = new HashMap<>();
        hmap.put("one", "java");
    }
}
