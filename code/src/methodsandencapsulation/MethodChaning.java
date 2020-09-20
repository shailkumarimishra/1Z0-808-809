package methodsandencapsulation;

public class MethodChaning {
	int a;
	float b;
	MethodChaning m1(int a) {
		this.a=a;
		System.out.println("hii");
		return this.m2(a);
	}
	MethodChaning m2(float b) {
		System.out.println("hey");
		return this.m3(b);
	}
	MethodChaning m3(double d ) {
		System.out.println("hello");
		return null;
	}

	public static void main(String[] args) {
		MethodChaning ob=new MethodChaning();
		ob.m1(10);
	}

}
