package oops.pack1;
/*
 * Special Note for all gadhi:-
 * 1. you must remembers overloading and overriding concept throughly.
 * 2. overloading happens within a class or w.r.t inheritance.
 */
public class OverloadingProblem {
	public static void main(String[] args) {
		C c=new D();
		c.show("shradha");
	}
}
class C{
	public void show(Object obj) {
		System.out.println("parent");
	}
}
class D extends C{
	public void show(String obj) {
		System.out.println("child");
	}
}