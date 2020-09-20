package com.mis;

public class Test {

	public static void main(String[] args) {
		SingletonDemo instance = SingletonDemo.getInstance();
		SingletonDemo instance2 = SingletonDemo.getInstance();
		SingletonDemo instance3= SingletonDemo.getInstance();
		SingletonDemo instance4 = SingletonDemo.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
//hashCode same means single object is created.
	}

}
