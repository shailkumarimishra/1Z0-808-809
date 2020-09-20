package com.localization;

import java.util.Arrays;
import java.util.Locale;

public class Localization {
	public static void printContentByLocale(String country) {
		switch(country) {
		case "IN":{
			System.out.println("Namaste");
		}
		case "US":{
			System.out.println("Hello");
			break;
		}
		case "UK":{
			System.out.println("Hello2");
			break;
		}
		default:
			System.out.println("hii");
		
		}
	}
	
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
//		Q How many ways you can create an object of the Locale?
//		1. using constructor
		Locale locale1=new Locale("fr");//overloaded constructor(1args,2args,3args)no default constructor present
//		2. way2
		Locale locale2=Locale.CANADA;
//		3. way3
		Locale locale3=Locale.getDefault();
//		4. way4
		Locale locale4=new Locale.Builder().setLanguageTag("it").build();
//		5. way5
		Locale locale5=Locale.forLanguageTag("it");
		printContentByLocale("US");
		Locale[] availableLocales = Locale.getAvailableLocales();	
		Arrays.stream(availableLocales).forEach(l->System.out.println(l.getLanguage()+" "+
												l.getDisplayLanguage()+" "+l.getCountry()+" "+
												l.getDisplayCountry()));
	}

}
