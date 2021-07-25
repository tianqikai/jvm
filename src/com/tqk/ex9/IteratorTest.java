//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tqk.ex9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorTest {
    public IteratorTest() {
    }

    public static void IteratorForIntTest(int[] arr) {
        long timeStart = System.currentTimeMillis();
        int min = 2147483647;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("Iterator 比较int最小值 花费的时间" + (timeEnd - timeStart));
    }

    public static void IteratorForObjectTest(List<Student> studentsList) {
        long timeStart = System.currentTimeMillis();
        Map<String, List<Student>> stuMap = new HashMap();
        Iterator var4 = studentsList.iterator();

        while(var4.hasNext()) {
            Student stu = (Student)var4.next();
            if (stu.getHeight() > 160) {
                if (stuMap.get(stu.getSex()) == null) {
                    List<Student> list = new ArrayList();
                    list.add(stu);
                    stuMap.put(stu.getSex(), list);
                } else {
                    ((List)stuMap.get(stu.getSex())).add(stu);
                }
            }
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("Iterator花费的时间" + (timeEnd - timeStart));
    }
}
