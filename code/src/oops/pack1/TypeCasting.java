package oops.pack1;
/*
 *Q. Difference b/w Interface and Abstract class?
 *Ans:- The fundamental difference b/w an Interface and Abstract class is that an Interface
 *		defines just the behavior. An Interface tells you nothing about the actual object
 *		other than how it behaves.
 *		An abstract class on other hand , defines an object which in turn drives the behavior.
 *		
 *		If you are capturing a behavior, you must use an interface. If you are capturing a
 *		conceptual object you must use an abstract class.
 *		for example, movement is a behavior that is displayed by various kinds of objects.
 *		such as a car, a cat or a person. These objects have only one thing in common
 *		that they move. saying it the other way round,if you get an object that moves, you
 *		don't get any idea about what kind of an object are you going to deal with.It could
 *		be a cat, a car or a person.
 *		If you were to capture this behavior in java, you would use an Interface named 
 *		Movable with a method name move(). On the other hand, If we talk about automobile
 *		a picture of an object starts forming in your head immediately. You can visualize 
 *		that an automobile could be something that would have an engine, would have wheels,
 *		and would move.You intuitively that a cat or a dog cannot be an automobile even 
 *		though they both do move.An abstract class is meant exactly for this purpose, when
 *		one's you identify a conceptual object you do not need to worry about it's behavior.
 *		The behavior kind of flows automatically.If you create an abstract class named
 *		Automobile, you are almost certain that it would have methods such a move(),accelarate(),
 *		brake(). It could have fields for capturing inner details such engine,wheels 
 *		and gears. You get all that just by saying the word automobile.
 *		From the above discussion, it should be clear that interfaces and abstract classes
 *		are not interchangeable.Even though an abstract class with no non-abstract methods
 *		looks functionally similar to an interface, both are fundamentally different.
 *  
 *		
 *
 *		   
 */
interface Movable{
	void move();
	
}
public class TypeCasting {

	public static void main(String[] args) {
		A1 a=new C1();
		B1 b=(B1)a;
		b.m2();
		((B1)a).m2();
		E e=new B1();
		E e1=new D1();
		E e3=null;
		A1 a1=new A1();
		B1 b1=new B1();
		C1 c=new C1();
		D1 d1=new D1();
		//Animal animal=new Animal(null);
		if(c instanceof C1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
interface E{
	
}
class A1 implements E{
	public void m1() {
		
	}
}
class B1 extends A1{
	public void m2() {
		System.out.println("m2()");
	}
}
class C1 extends B1{
	public void m3() {
		
	}
}
class D1 extends C1{
	public void m4() {
		
	}
}