package com.tqk.ex8;

/**
 * 静态分派--方法的重载--编译阶段
 */
public class StaticDispatch{

	static abstract class Human{
		abstract void sayhello();
	}
	static class Man extends Human{
		@Override
		void sayhello() {
			System.out.println("hello,Man！");
		}
	}
	static class Woman extends Human{
		@Override
		void sayhello() {
			System.out.println("hello,Woman！");
		}
	}

	public void sayHello(Human guy){
		System.out.println("hello,guy！");
	}
	public void sayHello(Man guy){
		System.out.println("hello,gentleman！");
	}
	public void sayHello(Woman guy){
		System.out.println("hello,lady！");
	}
	public static void main(String[]args){
		StaticDispatch sr = new StaticDispatch();
		Human man = new Man();
		Human woman = new Woman();

		sr.sayHello(man);
		sr.sayHello(woman);

//		//实际类型变化
//		Human human=new Man();
//		//静态类型变化
//		sr.sayHello((Man)human);
//		human=new Woman();
//		sr.sayHello((Woman)human);


	}
}