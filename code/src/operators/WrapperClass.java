package operators;

public class WrapperClass {
//range:- -128 -> 127 & is applicable for Integerals only i.e for S,I,B,L not for D & F i.e; 
//if the value are in the given range only one object is created but
//if the value exceed the range then two object are created for same value stored in different variables.
	public static void main(String[] args) {
	//1.	Byte a=125;
//		Byte b=125;
	//2.	Integer a=129;//2.
		//Integer b=129;
		Double a= 126D;
		Double b=126D;
		System.out.println(a==b);//1.true2.false
		System.out.println(a.equals(b));//true

	}

}
