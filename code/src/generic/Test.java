package generic;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		MyArrayList<Integer> obj= new MyArrayList<>();
//		obj.add(5.0);
		ArrayList <I> obj1=new ArrayList<>();
		obj.m1(obj1);
		ArrayList<Object> obj2=new ArrayList<>();
		obj.m1(obj2);
		Combination<Impl> obj4=new Combination<>();
		
		
		ArrayList<String> l1 = new ArrayList<String>();//valid
		ArrayList<String> l2= new ArrayList<>();//valid
		ArrayList<?> l3 = new ArrayList<Integer>();//valid
		ArrayList<?> l9 = new ArrayList<>();//valid
		ArrayList<?> l4 = new ArrayList<String>();//valid
		ArrayList<? extends Number> l5 = new ArrayList<Integer>();//valid
//		ArrayList<? extends Number> l6 = new ArrayList<String>();// invalid
//		ArrayList<?> l7 = new ArrayList<? extends Number>();// invalid
//		ArrayList<?> l8 = new ArrayList<?>();// invalid
		ArrayList<? extends I> l10=new  ArrayList<Impl>(); 
		ArrayList<? super Impl> l11=new  ArrayList<Object>(); 
		ArrayList<? super I> l12=new  ArrayList<Object>(); 
		
		
		

		
	}

}
