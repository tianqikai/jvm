package com.tqk.ex9;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("张三", "李四", "王老五", "李三", "刘老四", "王小二", "张四", "张五六七");
        int maxLenZ=0;
        for (String name:names){
            if(name.startsWith("张")||maxLenZ<name.length()){
                maxLenZ=name.length();
            }
        }
        System.out.println(maxLenZ);

        maxLenZ = names.parallelStream().filter((name) -> {
            return name.startsWith("张");
        }).mapToInt((name)->name.length()).max().getAsInt();
        System.out.println(maxLenZ);
    }
}
