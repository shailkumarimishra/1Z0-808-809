package methodsandencapsulation;
/**
 * 1.Exact Matching
 * 2.Primitive Widening
 * 3.Exact Auto-boxing(byte->Byte)
 * 4.Object Argumented method
 * 5.var Argument
 * 6.Chudail ka prakoop matlab compile time error
 */
public class MethodSelection {
	/*public void m1(int i) {
		System.out.println("primitive int");
	}*/
	/*public void m1(float f) {
		System.out.println("primitive float");
	}*/
	/*public void m1(long l) {
		System.out.println("Primitive long");
	}*/
	public void m1(Integer i) {
		System.out.println("Wrapper Integer");
	}
	public void m1(Float f) {
		System.out.println("Wrapper Float");
	}
/*	public void m1(Object obj) {
	System.out.println("Object");	
	}*/
	public void m1(float...a) {
		System.out.println("var argument");
	}
	/*public void m1(byte b) {
		System.out.println("primitive byte");
	}*/
	/*public void m1(Byte b) {
		System.out.println("wrapper Byte");
	}*/

	public static void main(String[] args) {
		MethodSelection sel=new MethodSelection();
		sel.m1((byte)10);

	}

}



