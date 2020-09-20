 package javabasics;

public class ExecutionOrder {
	int a;
	float f=10.5F;
	double d1=20.5D;
	int d = m3();
	static {
		System.out.println("static block 3");
	}
	static int b;
	static int c = m1();

	{
		System.out.println("block 1");
		int a = 50;
		System.out.println(this.a);
	}

	{
		System.out.println("block 2");
	}
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}

	static int m1() {
		System.out.println("m1()");
		return 20;
	}

	static void m2() {
		System.out.println("m2()");
	}

	int m3() {
		System.out.println("m3()");
		return 10;
	}

	void m4() {
		System.out.println("m4()");

	}

	ExecutionOrder() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		new ExecutionOrder();
	}

	static {
		System.out.println(b);
		System.out.println(c);
	}
	{
		System.out.println(a);
		System.out.println(d);
	}
}
