package com.ohgiraffers.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Stack;

public class Application3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> brstack = new Stack<>();

            try {
            while (true) {
                System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
                String customer = br.readLine();

                if (customer.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (customer.equalsIgnoreCase("next")) {
                    if (brstack.isEmpty()) {
                        System.out.println("대기 고객이 없습니다.");
                    } else {
                        System.out.println(brstack.pop() + "고객님 차례입니다.");
                    }
                } else {
                    brstack.push(customer);
                    System.out.println(customer + "고객님 대기열에 추가되었습니다.");
                }
            }
        } catch (Exception e) {
                System.out.println(" 에러가 발생했습니다.");
            }
    }
}

