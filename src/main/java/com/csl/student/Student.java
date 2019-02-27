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

    public int highest() {

        int highestScore = 0;
        if (english > math) {
            highestScore = english;
        }
        else {
            highestScore = math;
        }

        highestScore = english>math ? english : math;

        return  highestScore;
    }


    public void print() {
        System.out.print("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math +
                "\taverage: "+ getAvg());

        if (getAvg() > 60) {
            System.out.println("\tPASS");
        }
        else {
            System.out.println("\tFAILED");
        }


        int avg = getAvg();
        char level = 'F';
        if (avg >= 90) {
            level = 'A';
        }
        else if (avg >= 80) {
            level = 'B';
        }
        else if (avg >= 70) {
            level = 'C';
        } else if (avg >= 60) {
            level = 'D';
        }
        else {
            level = 'F';
        }

        switch (avg/10) {
            case 9:
                level = 'A';
                break;
            case 8:
                level = 'B';
                break;
            case 7:
                level = 'C';
                break;
            case 6:
                level = 'D';
                break;
            default:
                level = 'F';
        }



        System.out.println("LEVEL: "+ level);
    }

    public int getAvg() {
        return (english+math)/2;
    }
}
