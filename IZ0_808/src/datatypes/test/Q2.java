package datatypes.test;
/**
 * NOTE:-
 * In Integer class decode method accepts hex, octal & decimal no with their respective subscripts but it is unable to deal with binary numbers.
 * @author HP
 *
 */

public class Q2 {

	public static void main(String[] args) {
	Integer i1=Integer.decode("0x1e");
	Integer i2= new Integer("20");
	Integer i3=Integer.valueOf("30");
	System.out.println(i1);
//	System.out.println(Integer.toBinaryString(4));
	
	}

}
