package com.sda.HomeTask;

import static com.sda.HomeTask.InsertionSort.printArray;

public class InsertionMain {
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);

    }

}
