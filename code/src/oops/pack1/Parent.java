package oops.pack1;

import java.util.List;

public class Parent {
protected String name;
public static int a=10;
 void m1() {
	System.out.println("parent instance m1()");
}
protected void m2() {
	
	System.out.println("parent instance private m2()");
}
public static void m3() {
	System.out.println("parent  m3()");
}
public Parent() {
	
}
public String m4(Object...object) {
	System.out.println("parent");
	return "kala";
}
public void m5(List<String> list) {
	System.out.println("parent list");
}
public void display(Object obj) {
	System.out.println("display Parent");
}
}
class Child1 extends Parent{	
	public String m4(Object[] object) {//line 24
		System.out.println("child");
		return "kala";
	}
	public String m4(String[] object) {//line 27
		System.out.println("string array");
		return "kala";
	}
	public String m4(Object object) {//line 30
		return "kala";
	}
	/*public void m5(List<Integer> list) {
		System.out.println("child list");
	}*/
	public void display(String obj) {
		System.out.println("display child");
	}


	public static void main(String[] args) {
		Child1 child=new Child1();
		child.name="anu";
		child.m1();
		child.a=30;
		child.m3();
//		child.m2();
}
}
