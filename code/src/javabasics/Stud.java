package javabasics;

public class Stud {
	static public int rollNo;
	public String name;
	public float totalMarks;
	static double phoneNo;
	public boolean admitted;
	{
		System.out.println("student record!!");
	}
	static {
		System.out.println("on the basis of marks student will get admission ...");
	}

	static int sub1() {
		return 90;
	}

	int sub2() {
		return 89;
	}

	int sub3() {
		return 50;
	}

	Stud() {
		System.out.println("total marks scored is= 229");
	}

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Stud s = new Stud();
		rollNo = 141;
		System.out.println(rollNo);
		s.name = "shail";
		System.out.println(s.name);
		System.out.println(s.totalMarks);
		System.out.println(phoneNo);
		s.admitted = true;
		System.out.println(s.admitted);
		a = sub1();
		System.out.println(a);
		b = s.sub2();
		System.out.println(b);
		c = s.sub3();
		System.out.println(c);
	}

	{
		System.out.println(admitted);
	}
	static {
		System.out.println(phoneNo);
	}
}