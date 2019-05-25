package com.sda.Tasks;

public class NWDIteration {

    public static int NWDIteration(int numberOne, int numberTwo) {

        if (numberOne > numberTwo)

        {

            numberOne = numberOne - numberTwo;

        }

        else {

            numberTwo = numberTwo - numberOne;

        }


        return numberOne;
    }

    public static void main(String[] args) {

        System.out.println(NWDIteration (40,20));

    }

}


