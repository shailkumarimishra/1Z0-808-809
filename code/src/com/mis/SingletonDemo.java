package com.mis;
/*
 1. Declare a static variable of given class type.
 2. Make constructor private.
 3. Define a static method which return a instance of the given class.
 */
/*here,eager loading:- All the data is retrieved in single query,which can then be cached to
                       improve the application performance.(more memory consumed)*/
public class SingletonDemo {
private static SingletonDemo instance=new SingletonDemo();
private SingletonDemo() {
	
}
public static SingletonDemo getInstance() {
	return instance;
}
}
