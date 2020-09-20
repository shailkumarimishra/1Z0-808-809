package oops.pack1;
/*
 * Special Note for all chudail:-
 * this keyword always point to current class object.
 */
public class OverridingProblem {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}
}
class A{
	public A() {
		super();
		this.m2();
	}
	public void m1() {
		m2();
	}
	public void m2() {
		System.out.println("parent m2()");
	}
}
class B extends A{
	public B() {
		super();
	}
	public void m1() {
		
	}
	public void m2() {
		System.out.println("child m2()");
	}
}


