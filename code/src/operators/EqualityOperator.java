package operators;

public class EqualityOperator {
	String s5="kala";
	String s6="kala";
	
	
	{
		
	System.out.println(s5==s6);//true
	System.out.println(s5.equals(s6));//true
	}
	String s7=new String("amit");
	String s8=new String("amit");
	{
		System.out.println(s7==s8);//false
		System.out.println(s7.equals(s8));//true
	}
	{
		s7="dash";
	}
//khule mei sonch nahi karna hai...but yaha band hai :)
	  {  
		  s5="Anu";
		  System.out.println(s5);
      System.out.println(s6==s5);//
		System.out.println(s6.equals(s5));}
	

	public static void main(String[] args) {
		EqualityOperator obj=new EqualityOperator();
		String s1="Anjali";
		String s2="Anjali";
		System.out.println(s2);//Anjali
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		String s3=new String("shail");
		String s4=new String("shail");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
        s2="Anu";//khule mei sonch nahi karna hai...but yaha band hai :)
        System.out.println(s2);
        System.out.println(s1==s2);//
		System.out.println(s1.equals(s2));
		s3="ambe";
		System.out.println(s3);
		System.out.println(s3==s4);//
		System.out.println(s3.equals(s4));//
	}

}
