package com.sda.Tasks;

import java.util.Scanner;

public class PrimeNumberRange {

        public static void main (String[] args) {

            int i =0;
            int num =0;

            String  primeNumbers = "";
            System.out.println("Please insert MAX in RANGE");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            for (i = 1; i <=  number; i++)
            {
                int counter=0;
                for(num = i; num >= 1; num--)
                {
                    if(i % num == 0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                }
            }

            System.out.println("Prime numbers are :");

            System.out.println(primeNumbers);

        }

    }

