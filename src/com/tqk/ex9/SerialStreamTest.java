//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tqk.ex9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SerialStreamTest {
    public SerialStreamTest() {
    }

    public static void SerialStreamForIntTest(int[] arr) {
        long timeStart = System.currentTimeMillis();
        Arrays.stream(arr).min().getAsInt();
        long timeEnd = System.currentTimeMillis();
        System.out.println("SerialStream串行 比较int最小值 花费的时间" + (timeEnd - timeStart));
    }

    public static void SerialStreamForObjectTest(List<Student> studentsList) {
        long timeStart = System.currentTimeMillis();
        Map<String, List<Student>> stuMap = (Map)studentsList.stream().filter((s) -> {
            return s.getHeight() > 160;
        }).collect(Collectors.groupingBy(Student::getSex));
        long timeEnd = System.currentTimeMillis();
        System.out.println("Stream串行花费的时间" + (timeEnd - timeStart));
    }
}
