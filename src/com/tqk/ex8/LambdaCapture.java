package com.tqk.ex8;

/**
 *当 Lambda 表达式访问一个定义在 Lambda 表达式体外的非静态变量或者对象时，这个 Lambda 表达式称为“捕获的”
 *当 Lambda 表达式没有访问一个定义在 Lambda 表达式体外的非静态变量或者对象,那么这个表达式是非捕获的Lambda表达式
 */
public class LambdaCapture {
    public static void main(String[] args) {
        repeatMessage("捕获",3);
        repeatMessage();
    }
    public static void repeatMessage(String text, int count) {//捕获型

        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }
    public static void repeatMessage() {//非捕获型
        Runnable r = () -> {
                System.out.println("窝 嫩 叠!");
        };
        new Thread(r).start();
    }
}