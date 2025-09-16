package com.ohgiraffers.section01.exception;

import java.io.File;
import java.io.IOException;

public class Appliciont3 {
    public static void main(String[] args) {
        /* File 클래스의 사용 용벙을 이해할 수 있다.*/

        /* 대상 파일이 존재하지 않더라도 인스턴스를 생성할 수 있다.*/
        File file = new File("test.txt");

        try {
            /* 파일 생성 후 성공 실패 여부가 반환 되며 파일이 존재할 경우에는 false */
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
