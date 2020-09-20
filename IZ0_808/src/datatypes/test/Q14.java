package datatypes.test;

public class Q14 {

	public static void main(String[] args) {
		A ab=new B();
		
		System.out.println(ab.x);
		System.out.println(B.j);
		System.out.println(ab.j);
//		System.out.println(A.x);
	}

}
class A{
	protected int x=10;
	static int j=21;
}
class B extends A{}
