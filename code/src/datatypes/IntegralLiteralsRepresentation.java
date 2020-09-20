package datatypes;

import java.util.ArrayList;

public class IntegralLiteralsRepresentation {

	public static void main(String[] args) {
		int a=0b100;
		int b=053;
		System.out.println(a);
		System.out.println(b);
		float c=1_00_000.89f;
		char d='\u0000';
		char e='\uffff';
		System.out.println(d);
		System.out.println(e);
		
		char g=65535;
		char h=0;
		System.out.println(d==h);
		System.out.println(g==e);
		int i='a';
		char s='a';
		System.out.println(i);
		System.out.println(s);
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		System.out.println(l.add(10));
		

	}

}
