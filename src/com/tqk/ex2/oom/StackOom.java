package com.tqk.ex2.oom;

/**
 * 栈溢出  -Xss=1m
 */
public class StackOom {
    static void stack(){
        stack();//方法不断执行-栈帧不断入栈(不出栈)
    }

    public static void main(String[] args) {
        stack();
    }
}
