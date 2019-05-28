package com.sda.Stoper;

public class StopWatch {

    float result;
    long startTime;
    public void start() {
        startTime = System.nanoTime();
    }
    public float stop() {

        result = (System.nanoTime() - startTime)/1000000f;
        System.out.println(result);
        return result;
    }
}
