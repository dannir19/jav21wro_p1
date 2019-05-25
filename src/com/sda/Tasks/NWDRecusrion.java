package com.sda.Tasks;

public class NWDRecusrion {

    public static int NWDRecursion(int numberOne, int numberTwo) {

        if (numberTwo == 0) {

            return numberOne;

        } else
        {

            return NWDRecursion(numberTwo, numberOne % numberTwo);

        }

        // public static void main(String[] args) {

           //  System.out.println(NWDRecursion(40, 20));


        }
    }



