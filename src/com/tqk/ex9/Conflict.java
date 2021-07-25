package com.tqk.ex9;

import java.util.List;

public class Conflict {
    public Conflict() {
    }
    //因为存在泛型擦除，这两个method方法参数是一样的，无法重载
//    public static String method(List<String> integerList) {
//        System.out.println("List");
//        return "tqk";
//    }
    public static Integer method(List<Integer> integerList) {
        System.out.println("List");
        return 0;
    }
}