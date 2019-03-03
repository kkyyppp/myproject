package com.csl.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println("secret: " + secret);

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number!=secret) {
            System.out.println("Please, enter a number");
            number = scanner.nextInt();

            if (number > secret)
                System.out.println("lower");
            else if (number < secret)
                System.out.println("higher");
            else
                System.out.println("Greate you got it, secret number is: "+secret);
        }


        // do while example
        int i =  0;
        do {
            System.out.print(i++);
        }while (i != 3);
    }


}
