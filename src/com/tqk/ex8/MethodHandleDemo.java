package com.tqk.ex8;

import java.lang.invoke.*;

/**
 * 方法句柄 MethodHandle
 *
 */
public class MethodHandleDemo {
    static  class  Bike  {
        String  sound()  {
            return  "ding  ding ding";
        }
    }
    static  class  Animal  {
        String  sound()  {
            return  "wow  wow wow";
        }
    }
    static  class  Man  extends  Animal  {
        @Override
        String  sound()  {
            return  "窝 室 嫩 叠";
        }
    }
    public static void main(String[] args) throws Throwable {
        System.out.println(sound(new Bike(),"sound"));
        System.out.println(sound(new Animal(),"sound"));
        System.out.println(sound(new Man(),"sound"));
    }
    static  String sound(Object object,String methodName) throws Throwable {
        //方法句柄--工厂方法Factory
        MethodHandles.Lookup lookup= MethodHandles.lookup();
//        lookup.
        //方法类型表示接受的参数和返回类型（第一个参数是返回参数）
        MethodType methodType=MethodType.methodType(String.class);
        //拿到具体的MethodHandle(findVirtual相当于字节码)
        MethodHandle methodHandle=lookup.findVirtual(object.getClass(),methodName,methodType);
        String msg=(String) methodHandle.invoke(object);
        return  msg;
    }
}
