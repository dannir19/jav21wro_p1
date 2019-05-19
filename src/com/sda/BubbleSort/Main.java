package com.sda.BubbleSort;

import java.util.Random;

public class Main {
    static  int arrSize = 20;
    public static void main(String[] args) {
        int[] arr = new int [arrSize];

        Random rand = new Random();
        for (int i =0; i < arr.length; ++i) {
            arr[i] = rand.nextInt(26) -5;
            int [] sortedArr = sort(arr);

        }
        private static int[] sort(int[] arr) {

            boolean isSorted = false; // posortowany

            while(!isSorted) {
                isSorted = true;
                for (int i= 0; i < arr.length-1; i++) {

                    if (arr[i] > arr[ i+1] {

                            int tmp = arr[i] ;// zamieniamy
                            arr[i] = arr [i+1];
                            arr[i+1] = tmp;
                            isSorted = false;



                    }
                }
            }
            return arr;
        }
    }
}
