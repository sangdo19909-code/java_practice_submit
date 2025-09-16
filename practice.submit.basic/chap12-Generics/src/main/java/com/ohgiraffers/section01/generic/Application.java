package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {
        /* 제니릭 프로그래밍
        * 데이터 형식에 의존 없이 여러 다른 데이터 타입을 가질 수 있는 기술 >재사용성
        * 1. 컴파일 시 타입 검사를 통한 타입 안정성 확보
        * 2. 반환 값 타입 변환 코드 생략*/


        /* 타입을 Integer로 생성
        *  래퍼런스 변수 선언으로 인해 타입 추론이 가능하므로 인스턴스 생성 시에는 타입 명시하지 않아도 된다.*/
        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setValue(10);
        gt1.setValue("hello");
        Integer num = gt1.getValue();

        /* 타입을 Stirng으로 생성 */
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("hello");
            //gt2.setValue(10);
        Stirng str = gt2.getvalue();

        GenericTest gt3 = new GenericTest();
        gt3.setValue(10);
        gt3.setValue("hello)");
        String str2 = (String)gt3.getValue();

    }

}
