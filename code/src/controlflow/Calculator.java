package controlflow;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
	public static void additionOfNumbers(int...add) {
		System.out.println("add: "+add.length);
		int sum=0;
		for(int a1:add) {
			sum+=a1;
		}
		System.out.println("sum is: "+sum);
	}
	public static void multiplicationOfNumbers(double...m) {
		double multi=1;
		for(double a2:m) {
			multi*=a2;
		}
		System.out.println("multiplication is: "+multi);
	}
	public static void divisionOfTwoNumbers() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter dividend: ");
		double dividend=sc1.nextDouble();
		System.out.println("enter divisor: ");
		double divisor=sc1.nextDouble();
		double quotient=dividend/divisor;
		System.out.println("division of given numbers is: "+quotient);
	}
	public static void average() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter your scored: ");
		double scored=sc2.nextDouble();
		System.out.println("enter Total: ");
		double outOf=sc2.nextDouble();
		double avg=(scored/outOf)*100;
		System.out.println("Average is: "+avg);
	}
	/**public static void squareRootOfNumber(double sqt) {
		d
		System.out.println());
	}**/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:- \n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Average\nEnter your choice: ");
		int ch=sc.nextInt();
		System.out.println("Enter values: ");
		ArrayList<Integer> list=new ArrayList<>();
	//	System.out.println(args.length);
		while(!sc.nextLine().isEmpty() && sc.hasNextInt()) {
			
			int nextInt = sc.nextInt();
			System.out.println(nextInt);
			list.add(nextInt);
//			if(sc.nextLine().equals(""))
//				break;
		}
		System.out.println(list);
		Object[] a=list.toArray();
		System.out.println("array: "+a.length);
		int [] array=new int[a.length];
		int i=0;
		for(Object obj:a) {
			int value=(int) obj;
			array [i++]=value;
		}
		System.out.println("array: "+array.length);
		switch(ch) {
		case 1:
		{   
		additionOfNumbers(array);
			break;
		}
		case 2:
		{
			additionOfNumbers(array);
			break;
		}
		case 3:
		{
			multiplicationOfNumbers();
			break;
		}
		case 4:
		{
			divisionOfTwoNumbers();
			break;
		}
		case 5:
		{
			average();
			break;
		}
		default:
			System.out.println("Invalid Choice!!");
			
		}
		
		

	}

}
