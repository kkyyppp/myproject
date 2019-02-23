package com.csl.student;

public class Student {
    String id;
    String name;
    int english;
    int math;



    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.println("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math +
                "\taverage: "+ (english+math)/2);
    }
}
