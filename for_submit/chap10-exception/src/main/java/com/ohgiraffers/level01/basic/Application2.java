package com.ohgiraffers.level01.basic;

import java.time.DateTimeException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Application2 {
    public static void main(String[] args) throws InvalidAgeException {
        /*생년월일을 입력 받아 만 20세 미만일 경우 InvalidAgeException이라는
         사용자 정의 예외를 발생시키는 프로그램을 작성한다.*/

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) :");
            String birthday = scanner.nextLine();
            System.out.print(birthday);

            String birthyear = birthday.substring(0, 4);
            int year = Integer.parseInt(birthyear);
            int age = Period.between(year, java.Local.now()).getYears();

            if (age < 20) {
                throw new InvalidAgeException("20세 미만은 입장 불가입니다.");
            }
            System.out.println("입장하셔도 됩니다.");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }
    }
}
