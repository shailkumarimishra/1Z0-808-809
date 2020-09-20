package controlflow;

public class SwitchStatement {

	public static void main(String[] args) {
		byte a=30;
//		while(true) {int z=10;}
		
		final int b=40;
		
		//b=40;
		final int c=50;
		
		switch(a) {
		
		case 10:{
			System.out.println("bhaiya");
			break;
		}
		
		case -128:{
			System.out.println("anjali");
			break;}
		case 30:
			System.out.println("shail");
			System.out.println("shail");
			break;
		case b:
			System.out.println("anu");
			break;
		case c:
			System.out.println("mahii bhaiya");
			break;
		default:
			System.out.println("ambe");
			break;
		}
		
System.out.println("hello");
	}
	enum WeekDays{
		SUN,MON,TUE;
	}

}
