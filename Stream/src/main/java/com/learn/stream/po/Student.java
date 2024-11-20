package com.learn.stream.po;

import lombok.Data;

@Data
public class Student {

    private String name;
    private int age;
    private double score;


    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    Student() {
    }

}
