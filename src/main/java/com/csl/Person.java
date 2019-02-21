package com.csl;

public class Person {

    String name;
    float weight;
    float height;

    public Person() {

    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        //this.weight = weight;
        // this.height = height;
        //等於以下，但是自呼叫建構子必須在第一行呼叫
        this(weight, height);
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello Java");
    }
}
