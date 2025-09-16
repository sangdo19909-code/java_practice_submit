package com.ohgiraffers.level01.basic;

import java.io.IOException;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.SQLOutput;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> urlStack = new Stack<>();

        while (true) {
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = br.readLine();

            if (url.equalsIgnoreCase("exit")) {
                break;
            }

            urlStack.push(url);

            while (urlStack.size() > 5) {
                urlStack.remove(0);
            }

            System.out.println("peek : " + urlStack);
        }
        System.out.println("프로그램종료");
    }
}
