package com.korshl10.chap20.project.UI;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);



    public void run() {
        while(true) {
            System.out.println("\n=====열공 카드 회원 관리 프로그램=====");
            System.out.println("1. 모든 회원 정보 조회");
            System.out.println("2. 회원 가입");
            System.out.println("3. 회원 찾기");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 코인 채굴");
            System.out.println("6. 코인 교환");
//            System.out.println("7. 등급 확인");
            System.out.println("8. 프로그램 종료");
            System.out.println("번호 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> showAllUsers();
                    case 2 -> registerMember
                    case 3 -> searchMember
                    case 4 -> modifyMember
                    case 5 -> coinMining
                    case 6 -> coinExchange
//                    case 7 ->
                    case 8 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("입력 오류입니다.");
                }
            } catch (Exception e) {
                System.out.println("오류 관련 ~~");
              }
        }
    }
    public






}
