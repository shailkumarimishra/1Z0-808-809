package controlflow;

import java.util.Scanner;

public class BirthdayCalender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Friend Name: ");
		String name=sc.next();
		switch(name){
			case "Shail" : case "shail":
				System.out.println("Shail birthdate is 29th November...");
				break;
			case "Anjali":  case "anjali":
				System.out.println("Anjali birthdate is 28th September...");
				break;
			case"Ambe": case "ambe":
				System.out.println("Ambe birthdate is 12th July...");
				break;
			case"Anu": case "anu":
				System.out.println("Anu birthdate is 7th March...");
			default:
				System.out.println("SORRY!!! You Have Not Marked This Name in the Calender...");
				
			
		}
	

	}

}
