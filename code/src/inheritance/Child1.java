package inheritance;

public class Child1 extends Parent1 {
	int a=40;
	public  void m1()  {
		System.out.println("child1 m1()");
	}
   public  int m2(int a)  {
		System.out.println("Child1 a=  "+a);
		
		return a;
	}
	public String m3(String msg) {
		return msg;
	}
	private  void m4() {
		System.out.println(" m4() child");
	}
	final void m5() {
		System.out.println("m5() child");
	}
	static void m6() {
		System.out.println("m6");
	}
	public void m8() {
		System.out.println("m8()");
	}
}
