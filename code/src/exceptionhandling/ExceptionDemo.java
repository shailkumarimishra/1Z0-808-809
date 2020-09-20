package exceptionhandling;
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
	catch(Exception ae){
//		ae=new ArithmeticException();
	System.out.println("Exception occur while dividing the no.");	
	}
	System.out.println(30/5);
	System.out.println("hello");
	System.out.println("hii");
	}
}
