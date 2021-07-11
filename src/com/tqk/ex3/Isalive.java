package com.tqk.ex3;

/**
 * VM Args：-XX:+PrintGC
 * 判断对象存活
 */
public class Isalive {
    public Object instance =null;
    //占据内存，便于判断分析GC
    private byte[] bigSize = new byte[10*1024*1024];

    public static void main(String[] args) {
        //objectA 局部变量表 GCRoots
        Isalive objectA = new Isalive();
        //objectB 局部变量表
        Isalive objectB = new Isalive();
        //相互引用  强引用
        objectA.instance = objectB;
        objectB.instance = objectA;
        //切断可达(切断根可达)
        objectA =null;
        objectB =null;
        //强制垃圾回收
        System.gc();
    }
}