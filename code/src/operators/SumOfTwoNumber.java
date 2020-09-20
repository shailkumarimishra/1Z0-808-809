package operators;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		int j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First no: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second no: ");
		int b=sc.nextInt();
		for(int i=a;j<=b;j++) {
		a++;
		}
		System.out.println("sum of two no is: "+ a);

	}

}
