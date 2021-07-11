package com.tqk.ex2;

/**
 * -Xms30m -Xmx30m -Xss1m -XX:MaxMetaspaceSize=30m  -XX:+UseConcMarkSweepGC -XX:-UseCompressedOops
 */
public class JVMObject {
    public final static String MAN_TYPE = "man";
    public static String WOMAN_TYPE = "woman";

    public static void main(String[] args) throws InterruptedException {
        Teacher T1 = new Teacher("Mark",MAN_TYPE,36);
        for (int i=0;i<15;i++){
            System.gc();
        }
        Teacher T2 = new Teacher("King",MAN_TYPE,18);
        Thread.sleep(Integer.MAX_VALUE);//线程休眠
    }
}
class Teacher{
    String name;
    String sexType;
    int age;

    public Teacher(String name, String sexType, int age) {
        this.name = name;
        this.sexType = sexType;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSexType() {
        return sexType;
    }
    public void setSexType(String sexType) {
        this.sexType = sexType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}