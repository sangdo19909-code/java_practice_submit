package com.ohgiraffers.setcion08.objectarray;

public class Apllication1 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        System.out.println(cars);               //stack영역에 저장된 레퍼런스 변수 (주소값 당김)
        System.out.println(cars[0]);             //haep 영역에 생성 된 레퍼런스 배열은 아직 비어있음(null)
//        cars[0].driveMaxSpped();                nullpointerException 발생

        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 300);
        cars[2] = new Car("롤스로이스", 300);
        cars[3] = new Car("부카티베이론", 300);
        cars[4] = new Car("포터", 300);



    }
}
