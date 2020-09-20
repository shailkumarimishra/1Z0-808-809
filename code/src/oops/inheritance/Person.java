package oops.inheritance;

public class Person {
public String name;
public static int personCount;
public String getName() {
	return name;
}
public static final int getPersonCount() {
	return personCount;
}
{
	}
static {
	
}
public final void m1() {
	
}
public Person() {
	
}
}
class Student extends Person{
	/*
	 * Method Overriding:- A subclass can completely replace the behavior of an inherited instance
	 * 				method for object of subclass by overriding it with new implementation
	 * `			of its own method without affecting the superclass's implementation 
	 * 				for objects of the superclass.
	 */
public String getName() {
	return "anu";
}
/*
 *Method Hiding:- A subclass cannot change the behavior of an inherited static method.
 *				 the subclass can hide the behavior of superclass static method by providing
 *				 a new implementation but it cannot replace the superclass's method. 
 */
/*public static final  int getPersonCount() {
	return personCount;
}
public static void m1() {
	
}*/
}
