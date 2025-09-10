package com.ohgiraffers.section02.encapsulation.problem2;


public class Monster {
    String name; //0개의 사용위치
    int hp; //0개의 사용자

    /* 간접 접근용 메소드(기능) 생성*? */
    public void setHp(int hp) {
        if (hp > 0) {
            /* this : 인스턴스 변수가 생성 되었을 때 자신의 주소를 저장하는 레퍼런스 변수 */
            this.hp = hp;
            System.out.println("양수 값이 입력 되어 몬스터의 체력을 입력 값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력 되어 몬스터의 체력을 0으로 변경");
        }
    }
}

