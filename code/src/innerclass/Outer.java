package innerclass;

public class Outer {
	public int i=40;
	public String s="Ambe";
	public static int j=70;
	{
//		 static int k=30;
		 
	}// we cannot define static members(static variable,static block,static methods)*/
//	inside inner class we cannot define static members.
//	from inner class we can access all the members of outer class directly.
  class Inner{
	  private  int i=50;
	  private String s1="Anjali";
//	  private static int k=90; 
	  public void m1() {
		  int i=10;
		  System.out.println(i);
		  System.out.println(this.i);
		  System.out.println(Outer.this.i);
		  System.out.println(j);// we can access static members.
		  
	  }
	/*  public static void m2() {
		  
	  }*/
	  /*static {
		  
	  }*/
  }
}
