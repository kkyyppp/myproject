package com.csl.student;

import java.util.Scanner;

public class SchoolRunner {

     public static void main(String[] args) {

         Student.pass=50;
         Student student = new Student("A", 60, 70);
         student.print();
         student = new Student("B", 60, 50);
         student.print();

         StudentK std = new StudentK("A", 50, 30);
         StudentK.
        // userInput();
     }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your name: ");
        String name = scanner.next();
        System.out.print("your English score: ");
        int english = scanner.nextInt();
        System.out.print("your math score: ");
        int math = scanner.nextInt();

        Student student = new Student(name, english, math);
        student.print();
        System.out.println("Highest Score: "+ student.highest());
    }
}
