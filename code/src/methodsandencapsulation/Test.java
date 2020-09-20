package methodsandencapsulation;

public class Test {
	final static int j=32;

	public static void main(String[] args) {
//		Student s=new Student(1, "Anjali", -20);
		//s.setStudentAge(-10);
		//System.out.println(s.getStudentAge());
		char c='A';
		System.out.println((int)'A');
		System.out.println((char)calc(c));

	}
	static int calc(int i) {
		return(i+j);
	}

}
