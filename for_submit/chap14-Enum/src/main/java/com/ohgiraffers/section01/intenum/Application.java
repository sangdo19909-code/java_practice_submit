package com.ohgiraffers.section01.intenum;

public class Application {
    public static void main(String[] args) {

        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEM;
        System.out.println("food : " + food);
        food = Foods.DRINGK_RADISH_KIMCHI_LETTE;
        System.out.println("food : " + food);

        /* 2가지가 모두 상수 0이라는 값을 가지기 때문에 구분이 불가능하다.
        *  값이 변경되어도 if문의 조건은 충족하여 출력이 된다.*/
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEM);


        /* 2. 정수형 상수는 문자열로 출력하기 어렵다.*/
        System.out.println(Foods.");

    }
}
