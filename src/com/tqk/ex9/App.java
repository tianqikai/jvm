package com.tqk.ex9;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "240");
        Random r = new Random();

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = r.nextInt();
        }

        IteratorTest.IteratorForIntTest(arr);
        SerialStreamTest.SerialStreamForIntTest(arr);
        ParallelStreamTest.ParallelStreamForIntTest(arr);
    }
}
