package javabasics;

class Student {
	int rollNo;
	String name;
	String state;
	int phoneNo;

	void read() {
		System.out.println("books");
	}

	void speak() {
		System.out.println("speak");
	}
	public static void  main(String[] args) {
//		int a=new Student().rollNo;
		Student s=new Student();
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(s.state);
		System.out.println(s.phoneNo);
		s.rollNo=123;
		System.out.println(s.rollNo);
		s.read();
//		System.out.println(s.read());
		s.speak();
	}
}
