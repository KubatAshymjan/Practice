package com.company;
// туулган куну, аты, фамилиясы, жашы
public class Student {
    private int date_of_baerth;
    private String name;
    private String surname;
    private int age;

    public int getDate_of_baerth() {
        return date_of_baerth;
    }

    public void setDate_of_baerth(int date_of_baerth) {
        this.date_of_baerth = date_of_baerth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
