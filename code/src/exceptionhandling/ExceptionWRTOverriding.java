package exceptionhandling;
import java.io.*;
public class ExceptionWRTOverriding extends Student {
	@Override
	public Object getFullName(String firstName,String lastName) throws IOException  {
		
		return firstName+" "+lastName;
	}
	public void m1() {
		System.out.println("child");
	}

	public static void main(String[] args) throws Exception {
		Student obj= new ExceptionWRTOverriding();
		Object result=obj.getFullName("shail", "chudail");
		System.out.println(result);

	}

}
