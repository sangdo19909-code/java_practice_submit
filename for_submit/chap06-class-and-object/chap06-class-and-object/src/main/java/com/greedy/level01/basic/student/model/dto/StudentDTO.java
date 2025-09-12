package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {
    private int grade;                      //학년
    private int classroom;                  //반
    private String name;                    //이름
    private int kor;                        //국어점수
    private int eng;                        //영어점수
    private int math;                       //수학점수

    public StudentDTO() {};

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name =  name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public String getinformation() {
        String message = "학년=" + grade + ", 반=" + classroom + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math;
        return message;
    }

}

