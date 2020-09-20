package exceptionhandling;
import java.io.*;
public class Student {
public Object getFullName(String firstName,String lastName) throws IOException {
	System.out.println("from parent");
	if (lastName.equals("chudail"))
		throw new IOException();
	return firstName+" "+lastName;
}
}
