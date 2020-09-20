package methodsandencapsulation;
/**
 * 1. If you are providing "null" and there are more than 1 siblings available then ambiguity occurs and you will get compile time error
 * but if there is a parent child relation then child argument will execute.
 * 
 * 2. In method overloading argument lists is differ based on order of arguments(primitive) then there may be chance to get ambiguity error
 * and you will get compile time error.
 * 
 * 3.Method overloading AKA(also known as) earlybinding/compiletime polymorphisim.
 * 
 * 4.method overloading occurs in the same class.
 *
 */
public class MethodAmbiguity {
	/**public void m1(String s) {
		System.out.println("string arg");//++++++child , since line no.16 & line no.22 i.e String and object are having parent-child 
		                                 //relationship Therefore child argument will execute.
	}**/
	public void m1(int[] array) {
		System.out.println("array arg");
	} //here array of int type is sibling of String so it will give compile time error 
	public void m1(Object obj) {
		System.out.println("Object arg");//+++++++ parent 
	}
	public void m1(float f1,int f) {
		System.out.println("float, int args");
	}
	public void m1(float f,float f1) {
		System.out.println("float,float args");
	}
	public void m1(int i,int j) {
		System.out.println("int, int args");
	}
	public void m1(int i, float f) {
		System.out.println("int,float args");
	}

	public static void main(String[] args) {
		MethodAmbiguity ma=new MethodAmbiguity();
		ma.m1(null);

	}

}
