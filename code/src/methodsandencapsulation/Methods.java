package methodsandencapsulation;

import api.Student;

public class Methods {
public void m1(String name) {
	if(name.equals("Chudail"))
		return ;//control out of method if name is  chudail.
	else
		System.out.println("Anjali is not a chudail");
}
public int m2() {
//	return 0;
	byte b=10;
	short s=20;
	char ch='a';
	double d=10.0d;
//	return b;
//	return s;
//	return ch;
	return (int)d;
}
public Student m3() {
//	return null;
	Student s1=new Student(1,null,null);
	return new Student(1,null,null);
//	return s1;
}
public int[] m4() {
//	return null;
	return new int[0];
	/**int[] array= {10,20,30};
	return array;**/
	/**int[] arr=new int[5];
	return arr;**/
}
public String m5() {
//return null;
//	return "Anjali";
	return new String("shail");
}
public Object m6() {
//	return null;
//	return "shail";
//	return 10;
//	Student s=new Student(10,null,null);
//	return s;
//	return new Student(5,null,null);
//	return new int[3];
	return new Object();
}
public String[] m6(String[] names) {
//return null;
//	return names;
	String[] arrays= {"Shail","Anjali"};
//	return arrays;
	return new String[0];
}
public void m7(int a, int b, String name,Student s,int []array,Object obj) {
return ;
//System.out.println("Anjali");
}
}
