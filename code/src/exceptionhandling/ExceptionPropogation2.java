package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPropogation2 {
	public void m1() {
		System.out.println("I am m1()");
		m2();

	}

	public int m2() {
		System.out.println("I am m2()");
		/**
		 * try { m3(); } catch (IOException e) {
		 * 
		 * }
		 **/
//		m3();
		return 10;
	}

	public void m3() throws NullPointerException {
		System.out.println("I am m3()");
		throw new RuntimeException();

	}
	/**
	 * difference b/w checked vs unchecked:-
	 * 
	 * 1. checked exception is recoverable whereas unchecked exception is not recoverable
	 * 2. checked exception, compiler will force you to handle the exception or propagate it to 
	 * the caller whereas for unchecked exception compiler will not force you.
	 * 3. checked exception, if you are throwing a checked exception, in throws clause you must propagate either same type Exception or
	 * its parent type whereas in unchecked Exception there is no such restrictions.  
	 * 
	 * NOTE:- 
	 * 
	 * 1. While handling the Exception child come first then the parent (valid for both checked & unchecked)
	 * 2. a) If you are throwing a checked Exception, in throws clause if there are multiple exceptions then you have to insert "," b/w
	 * them (here,order doesn't matter) to represent.
	 * 2. b) In throws clause you must propagate either same type or its parent type (but in a group child type Exception,  you can also propagate).
	 * 
	 */

	public static void main(String[] args) {

	}

}
