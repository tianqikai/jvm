package com.tqk.ex2.oom;

/**
 * VM Args：-Xms30m -Xmx30m -XX:+PrintGCDetails
 * 堆内存溢出（直接溢出）
 */
public class HeapOom {
    //实际开发中不要使用大的数组和对象、字符串
    public static void main(String[] args) {
        String[] strings = new String[35*1000*1000];  //35m的数组（堆）
    }
}
