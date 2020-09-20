package methodsandencapsulation;
/**
 * #Difference between constructor overloading and method overloading:-
 * 1.you can invoke/call another constructor using this() function & 
 *   you can invoke/call another method using method signature of that method  
 * 2.constructor invocation will happen from constructor only but there is no restriction for method invocation
 *   (e.g., you can call method from block,method,constructor) 
 * 3.Recursive invocation of constructor error will happen at compile time but Recursive invocation of method error will
 *   occur at run time 
 *   
 * # similarity:
 * constructor overloading & method overloading are similar 
 * 
 *  Note:- 
 * 1. The compiler automatically provides a no-argument, default constructor for any class without constructors.
 *  This default constructor will call the no-argument constructor of the superclass.
 *  In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does.
 *  If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.
 *  
 * 2. You can use access modifiers in a constructor's declaration to control which other classes can call the constructor.(p3)
 */

public class ConstructorOverloading {
	ConstructorOverloading(){
		this(10,"Shail");
		m1();
	}
	
	ConstructorOverloading(int a,String s){
//		System.out.println("hii");
//		this(null);
//		ConstructorOverloading(null);
		this(null);
//		this();
		System.out.println("Two argumented constructor");
	}
	ConstructorOverloading(Methods obj){
//		this();

		System.out.println("Methods argumented constructor");
	}
	void m1() {
		this.m2(10, "Anjali");
	}
	void m2(int a,String s) {
		this.m3(10f, 10, 20d);
	}
	void m3(float b,int a,double d) {
		System.out.println("Three argumented method");
//		m1();
	}

	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();

	}

}
