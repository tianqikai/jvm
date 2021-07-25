package com.tqk.ex9;

import java.math.BigDecimal;

/**
 * 泛型方法
 * 引入一个类型变量T（其他大写字母都可以，不过常用的就是T，E，K，V等等）
 */
public class GenericMethod<T> {
    //泛型方法
    public <T> T genericMethod(T t){
        return t;
    }
    //普通方法
    public void test(int x,int y){
        System.out.println(x+y);
    }
    //泛型方法
    public static <T extends Number> double add(T t1, T t2) {
        double album;
        album = t1.doubleValue() + t2.doubleValue();
        return album;
    }
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.test(13,7);
        System.out.println(genericMethod.genericMethod("哈哈哈"));
        System.out.println(add(100.00,200.13));
    }
}