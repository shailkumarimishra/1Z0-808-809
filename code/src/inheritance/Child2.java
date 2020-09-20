package inheritance;

public class Child2 extends Parent1{
	int a=30;
	public void m1() {
		System.out.println("child2 m1()");
	}
	public int m2(int a) {
		System.out.println("Child2 a=  "+a);
		
		return a;
	}

}
