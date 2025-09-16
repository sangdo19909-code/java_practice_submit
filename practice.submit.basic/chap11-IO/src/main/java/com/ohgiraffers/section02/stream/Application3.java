package com.ohgiraffers.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* FileOutStream
        : File 이라는 외부자원으로 1 byte 단위로 출력하는 스트림 */

        /* 경로 문제 없이 파일이 존재하지 않을 경우에는 자동으로 파일이 생성 되지만
         존재 하지 않는 경로가 포함 되면 FileFoundException이 발샌한다.*/
        try (FileOutputStream fos = new FileOutputStream("testOutputStream", append)) {

            fos.write(97);

            byte[] bytes = new byte[] {98, 99 100, 101, 102, 10}
            fos.write(bytes);

            fos.write(bytes, 1, 3);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
