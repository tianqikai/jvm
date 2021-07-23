package com.tqk.ex8;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("say hello ");
        };
        runnable.run();
    }
}
