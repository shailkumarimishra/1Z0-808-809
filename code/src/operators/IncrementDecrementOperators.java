package operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=15;
		int z=10;
		int y=2;
		System.out.println(z%y);
		int q= c+ --c+ c++ + --c - --c;
		System.out.println(q);
//		int c=--b + b++ + b + b-- - --b;
//		System.out.println(c);
		a=++a;
		System.out.println(a++);//11
		System.out.println(a);//12
//		a=a+ ++a + a++ + --a + ++a;
//		System.out.println(a);
		System.out.println(a+ ++a + a++ + --a + ++a);//here it binary operator is used without assigning it to a variable b/c internally .toString() method is called which assign it to buffer.
		

	}

}
