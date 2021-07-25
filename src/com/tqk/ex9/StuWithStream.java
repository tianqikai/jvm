//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tqk.ex9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StuWithStream {

    public static void main(String[] args) {
        List<Student> studentList = Datainit();
        groupBy(studentList);
        total(studentList);
        MaxAndMin(studentList);
        filter(studentList);
    }

    public static List<Student> Datainit() {
        List<Student> students = Arrays.asList(new Student("小明", 168, "男"), new Student("大明", 182, "男"), new Student("小白", 174, "男"), new Student("小黑", 186, "男"), new Student("小红", 156, "女"), new Student("小黄", 158, "女"), new Student("小青", 165, "女"), new Student("小紫", 172, "女"));
        return students;
    }

    //分组
    public static void groupBy(List<Student> studentsList) {
        Map<String, List<Student>> groupBy = (Map)studentsList.stream().collect(Collectors.groupingBy(Student::getSex));
        System.out.println("分组后：" + groupBy);
    }
    /*
     *  过滤
     */
    public static void filter(List<Student> studentsList) {
        List<Student> filter = (List)studentsList.stream().filter((student) -> {
            return student.getHeight() > 180;
        }).collect(Collectors.toList());
        System.out.println("过滤后：" + filter);
        filter.stream().forEach(
                System.out::println
        );
    }
    /*
     * 长度求和
     */
    public static void total(List<Student> studentsList) {
        int totalHeight = studentsList.stream().mapToInt(Student::getHeight).sum();
        System.out.println("长度求和:"+totalHeight);
    }

    /**
     * 长度最大值 最小值
     * @param studentsList
     */
    public static void MaxAndMin(List<Student> studentsList) {
        int maxHeight = studentsList.stream().mapToInt(Student::getHeight).max().getAsInt();
        System.out.println("max:" + maxHeight);
        int minHeight = studentsList.stream().mapToInt(Student::getHeight).min().getAsInt();
        System.out.println("min:" + minHeight);
    }
}
 class Student {
    private String name;
    private int height;
    private String sex;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String name, int height, String sex) {
        this.sex = sex;
        this.name = name;
        this.height = height;
    }
}

