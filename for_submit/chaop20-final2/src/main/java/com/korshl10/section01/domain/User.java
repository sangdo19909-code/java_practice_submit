package com.korshl10.section01.domain;

public class User {
    private int no;
    private String name;
    private String id;
    private String pwd;
    private int age;
    private int account;


    public User(int no, String name, String id, String pwd, int age, int account) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.account = account;
    }

    public User(int nextUserNo, String pwd, String id, int age) {
    }

    public User(int no, String newPassword, int newAccount) {
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public int getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", " +
                '}';
    }



}
