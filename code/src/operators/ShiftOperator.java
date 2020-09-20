package operators;

public class ShiftOperator {

	public static void main(String[] args) {
	byte a=4;
//	System.out.println(a>>2);//1
	//System.out.println(a>>1);//2
	//System.out.println(a>>3);//0
	//right shift operator Note:- if +ve value put 0 at empty places and for -ve values put 1 at empty places
	//System.out.println(a<<2);//16
	//System.out.println(a<<1);//8
//	System.out.println(a<<3);//32
	byte b=-4;
	//System.out.println(b>>3);//-1
//	System.out.println(b>>2);//
//	System.out.println(b<<2);
	//Shift Right zero Fill Operator
//	System.out.println(a>>>2);//1
	System.out.println(b>>>2);//
//	int c=b>>>2;
//	System.out.println(Integer.toBinaryString(c));
	}

}
