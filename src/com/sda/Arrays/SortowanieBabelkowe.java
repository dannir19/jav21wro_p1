package com.sda.Arrays;

import java.util.Random;

public class SortowanieBabelkowe {
    public static void main(String[] args) {

        int arraysize = 20;
        int[] array = new int[arraysize];
        Random rand = new Random();

        for (int i = 0; i < arraysize; i++) {

            array[i] = rand.nextInt(26) - 5;
            System.out.print(" " + array[i]);

        }

    }
}





