package com.sda.Game;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GameSelection {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(99);
        System.out.println(" Insert number");
        int numberUser;


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numberUser = scanner.nextInt();
            if (numberUser == number) {
                System.out.println("Congratulation, You win");
                break;
            } else {
                System.out.println("Try again");
                if (numberUser < number) {
                    System.out.println("The number is greater");
                }
                if (numberUser > number) {
                    System.out.println("The number is less");

                }

            }
        }
    }
}









