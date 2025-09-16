package com.ohgiraffers.section02.extend;

public class MethodFarm {

    public <T> animalType(T t1, T t2) {}
    public <T extends Mammal> void MamType(T t) {}
    public <T> animalType(T t1, T t2) reptitleType{T t) {}
}



    String str= "2000";
    int birthYaer = Integer.parseInt(str);

    int currentYear = LocalDate.now().getYear();
    int age = currentYear - birthYaer;

    if (age < 20)
