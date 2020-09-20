package inheritance;

public class ParentExecutionOrder {
	
	int a;
	static float f = m4();
	String s="Shail";
	long l = m6();
	static double d = 10.3;

	{
		int b = 2;
		System.out.println("This is 1st instance bolck of parent class" + " " + b);
		b++;
	}
	static {
		
		System.out.println("This is 1st static block of parent class");
	}

	public static void m1() {
		System.out.println("This is 1st static method of parent class " + " " + d);
	}

	{
		System.out.println(l + "This is 2nd instance block of parent class");
	}

	public  void m2() {
		System.out.println("This is 1st instance method of parent class" + " " + s);
	}

	public static int m4() {
		System.out.println("This is 2nd static method of parent class");
		return 41;
	}

	public ParentExecutionOrder() {
		System.out.println("This is constructor of parent class" + " " + a);
	}

	static {
		System.out.println(f + " " + "This is 2nd static block of parent class");
	}

	public int m6() {
		System.out.println("This is 2nd instance method of parent class");
		return 45;
	}

	public static void main(String[] args) {
     ParentExecutionOrder parent=new ParentExecutionOrder();
     m1();
     parent.m2();
     m4();
     parent.m6();
	}

}
