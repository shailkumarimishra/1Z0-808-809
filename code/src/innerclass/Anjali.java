package innerclass;

import java.util.Comparator;

public class Anjali {
	int b=20;
	public int m1() {
		return 200;
	}
 static Ambe a = new Ambe() {
	  int a=10;
	 public int m1() {
		 System.out.println("m1()");
		 System.out.println(a);
//		 System.out.println(b);
		 return 100;
	 }
	 public void m2() {
		 System.out.println("anjali pagal hai");
	 }
	 
  };//Anonymous class
  Comparator<Integer> comp=new Comparator() {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}  
  };
  public static void main(String[] args) {
	System.out.println(a.m1());
//	System.out.println(a.m2());
}
@Override
public String toString() {
	return "Anjali [b=" + b + ", comp=" + comp + "]";
}
  
}
abstract class Ambe{
abstract int m1();	
}