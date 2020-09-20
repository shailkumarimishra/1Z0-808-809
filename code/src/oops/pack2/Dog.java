package oops.pack2;

import oops.pack1.Animal;
/*
 * 1. How can you call parent class constructor from child class?
 * Ans:- Using super() or super(args).
 * 2. Can you use super() other than constructor context?
 * Ans:- No, you can use super() in a constructor only and it must be first statement in a 
 * 		constructor.
 * 3. How can you call super class members without using any references or object?
 * Ans:- using super keyword.
 * 
 * Note:- You can use super or this keyword anywhere except static context.
 * Note:- either super() or this() must be first statement in the constructor not both.
 * 
 * 4. How can you call constructor of same class?
 * Ans:- using this() or this(args).
 * 5. How can you call current class members without using object?
 * Ans:- using this keyword.
 * 
 *  
 */
public class Dog extends Animal {
	public String name="Moti";
	public static int leg=6;
	public Dog() {
		super("shradha");
//		this(10);
//		super.name="kala";
		System.out.println(super.getName());
		super.getSound();
		System.out.println(super.leg);
	}
	public Dog(int age) {
		this("shail",10);
	}
	public Dog(String name, int age) {
		super("kala");
		System.out.println(super.name);
//		this();//invalid due to recursive constructor call.
		
	}
	
public void setName(String name) {
		this.name = name;
	}
	public static void setLeg(int leg) {
		Dog.leg = leg;
	}
public static void main(String[] args) {
	Dog d=new Dog();
}
}






