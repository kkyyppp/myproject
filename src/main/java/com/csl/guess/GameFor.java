package com.csl.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {

        int sum=0;
        for (int i=1; i<=10; i++) {
            sum+= i;
            System.out.println(sum);
        }

        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println("secret number is: "+ secret);

        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=4; i++) {
            System.out.println("Please, enter a number("+ i+ "/4)");
            int number = scanner.nextInt();
            System.out.println("第"+ i+ "次 :"+number );

            if (number > secret) {
                System.out.println("lower");
            } else if (number < secret) {
                System.out.println("higher");
            } else {
                System.out.println("your are correct, the secret number is "+ secret);
                break;
            }
        }

        System.out.println("Finish");
    }
}
