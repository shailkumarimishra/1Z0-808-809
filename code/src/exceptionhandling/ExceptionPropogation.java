package exceptionhandling;

import java.io.*;

public class ExceptionPropogation {
	public void m1() throws Exception  {
		System.out.println("I am m1()");
		m2();

	}

	public int m2() throws FileNotFoundException,Exception,IOException {
		System.out.println("I am m2()");
		/**
		  try { m3(); } catch (IOException | ArithmeticException e) {
		  
		  }
		 **/
		m3();
		return 10;
	}

	public void m3() throws FileNotFoundException {
		System.out.println("I am m3()");
		throw new FileNotFoundException();
	}

	public static void main(String[] args) throws Exception  {
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.m1();

	}

}
