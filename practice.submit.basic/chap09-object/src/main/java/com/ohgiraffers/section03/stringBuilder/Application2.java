package com.ohgiraffers.section03.stringBuilder;

public class Application2 {
    public static void main(String[] args) {
        /* StringBuilder  사용법*/
        StringBuilder sb = new StringBuilder();
        /*용량 (현재의 버퍼 크기)를 정수형으로 바환하며 문자열 길이 +16이 기본값 */
        System.out.println("sb.capacity() : " + sb.capacity());

        for(int i = 0; i < 50; i++) {
            /* 기존 문자열의 마지막에 전달 인자 추가*/
            sb.append(i);
            System.out.println("sb : " + sb);
            /* 처음부부터 끝까지 동일한 인스턴스 주소 값을 가짐 */
            System.out.println("sb.hashCode() : " + sb.hashCode());
            System.out.println("sb.capacity() : " + sb.capacity());
        }

        StringBuilder sb2 = new StringBuilder("javaorcle");
        System.out.println("sb2 : " + sb2);

        System.out.println("delete : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt : " + sb2.deleteCharAt(0));

        System.out.println("reverse : " + sb2.reverse());

    }
}
