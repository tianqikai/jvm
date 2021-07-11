package com.tqk.ex3;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/**
 * 软引用
 * -Xms20m -Xmx20m
 */

public class TestSoftRef {
	//对象
	public static class User{
		public int id = 0;
		public String name = "";
		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + "]";
		}

	}
	//
	public static void main(String[] args) {
		//new是强引用
		User u = new User(1,"King");
		//软引用
		SoftReference<User> userSoft = new SoftReference<User>(u);
		//干掉强引用，确保这个实例只有userSoft的软引用
		u = null;
		//看一下这个对象是否还在
		System.out.println(userSoft.get());
		//进行一次GC垃圾回收  千万不要写在业务代码中。
		System.gc();
		System.out.println("After gc");
		System.out.println(userSoft.get());
		//往堆中填充数据，导致OOM
		List<byte[]> list = new LinkedList<>();
		try {
			for(int i=0;i<100;i++) {
				//System.out.println("*************"+userSoft.get());
				list.add(new byte[1024*1024*1]); //1M的对象 100m
			}
		} catch (Throwable e) {
			//抛出了OOM异常时打印软引用对象
			System.out.println(e.getClass()+":"+e.getMessage());
			//系统将要发生内存溢出（OuyOfMemory）之前，这些对象就会被回收
			System.out.println("Exception*************"+userSoft.get());
		}

	}
}