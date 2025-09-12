package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] student = new StudentDTO[10];
        student[0] = new StudentDTO(1, 5, "홍길동", 40, 60, 70);

        int inputGrade = 0;
        int inputClassroom = 0;
        String inputName = "";
        int inputKor = 0;
        int inputEng = 0;
        int inputMath = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년 : ");
        inputGrade = scanner.nextInt();
        student[0].setGrade(inputGrade);


        System.out.print("반 : ");
        inputClassroom = scanner.nextInt();
        student[0].setClassroom(inputClassroom);


        System.out.print("이름 : ");
        inputName = scanner.next();
        student[0].setName(inputName);


        System.out.print("국어점수 : ");
        inputKor = scanner.nextInt();
        student[0].setKor(inputKor);


        System.out.print("영어점수 : ");
        inputEng = scanner.nextInt();
        student[0].setEng(inputEng);


        System.out.print("수학점수 : ");
        inputMath = scanner.nextInt();
        student[0].setMath(inputMath);

        System.out.println(student[0].getinformation());
        // System.out.println("계속 출력할 겁니까 ? (y/n) : ");
        ;

        student[1] = new StudentDTO(2, 1, "김말똥", 70, 80, 100);






    }
}
