package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchBlock {
	public void m1() throws IOException, FileNotFoundException {
		System.out.println("I am m1()");
		m2();

	}

	public int m2() throws  IOException, FileNotFoundException {
		System.out.println("I am m2()");
		/**
		 * try { m3(); } catch (IOException e) {
		 * 
		 * }
		 **/
		m3();
		return 10;
	}

	public void m3() throws FileNotFoundException,IOException, NullPointerException  {
		System.out.println("I am m3()");
		throw new IOException();
	}

	public static void main(String[] args) {
		MultiCatchBlock obj = null;
	
		/**try {
			obj.m1();
		} catch (FileNotFoundException fne) {
			System.out.println("fne");
		} catch (IOException io) {
			System.out.println("io");
		} catch (Exception e) {
			System.out.println("e");
		}**/
		
	try {
			obj.m1();
		}catch( NullPointerException|IOException e) {
//			e=new NullPointerException(); // e refference final so cannot modify it(only in multi-catch)
		}
		
		
		
		
		
		
		

	}

}
