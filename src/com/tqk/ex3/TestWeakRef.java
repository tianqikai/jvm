package com.tqk.ex3;

import java.lang.ref.WeakReference;

/**
 * 弱引用
 * @author Administrator
 */
public class TestWeakRef {
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
	public static void main(String[] args) {
		User u = new User(1,"King");
		WeakReference<User> userWeak = new WeakReference<User>(u);
		//干掉强引用，确保这个实例只有userWeak的弱引用
		u = null;
		System.out.println(userWeak.get());
		//进行一次GC垃圾回收,千万不要写在业务代码中。
		System.gc();
		System.out.println("After gc");
		System.out.println(userWeak.get());
	}
}
