package javabasics;

public class Test {
//	int k;
//	k=10;//invalid since java is object oriented so if one is performing any action it must be done in a method or blog
//	int l=10;//it is valid since declaration + initialization is allowed in java or it can be done
	
//int a=130;
//byte b=(int)a;
	static boolean x;
	static boolean y;
	public static void main(String[] args) {
		x=x||y && !x;
		y=y && x||y;
		int a=130;
		byte b=(byte)a;
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	
	    
		}
		
	}
