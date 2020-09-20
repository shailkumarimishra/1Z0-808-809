package api;

public class StringExample {

	public static void main(String[] args) {
	/**
	 * 1.Immutability? -> once you initialized the state of an object later you can't change it 
	 * 
	 * 2.Why String class is immutable? -> To achieve data consistency 
	 * 
	 * 3.Benefits of immutability.
	 * ->3.1 Data consistency
	 * ->3.2 Data security
	 * ->3.3 Thread safety
	 * 
	 * 4.What is String constant pool(SCP)?
	 * -> It is a kind of memory especially made for String class to improve
	 * memory utilization.In string constant pool duplicate objects are not allowed.
	 * -> To access String constant pool objects you can use intern() method.
	 * 
	 * 5.Benefits of SCP.
	 * -> To reduce memory consumption and enhanced the performance of the application.
	 *  
	 * 6.Difference b/w creating an object of String class using "new" operator and String literal.
	 * -> If you are creating a String object using "new"  operator then it will create 2 objects one in the heap
	 *    memory and other one in String constant pool(SCP)
	 * -> If you are creating a String using literal then it will create only one object in the String constant pool
	 * -> In Java an object occupy 8 bytes of memory.Hence,creating an object using String literal is always better 
	 *    than creating an object using "new" operator. 
	 *     
	 * 7.How can you make a Class immutable?
	 * -> 7.1 Make your class final using "final" keyword.so that no other class can extend it.
	 * -> 7.2 Make all fields private and final.
	 * -> 7.3 Don't provide setter methods
	 * -> 7.4 Provide getter methods only and if there is a reference type then use deep cloning(copy constructor).
	 * 
	 * 8.Reverse a word.
	 * 9.Reverse a sentence.
	 * 10.Reverse a particular word in the given sentence. 
	 * 11.Contract b/w equals and hashCode (**VVIMP)
	 */
String s1=new String("Anu");
System.out.println(s1==s1);
String s5=s1.intern();
System.out.println(s1==s5);
//s1=s1+"Kala";
s1.concat("Kala");
System.out.println(s1.concat("shail"));
String s2="Anjali";
String s3="Anjali";
String s4=new String("Anu");
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println(s2==s3);//
System.out.println(s1==s4);
System.out.println(s1.equals(s4));
System.out.println(s2.equals(s3));
System.out.println(s2.toUpperCase());

	}

}






