package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Q Validate Phone no
//Constraints:-
//1. Starts with 6,7,8,9
//2. length should be 10 digit only
//Q Validate Phone no
//Constraints:-
//1. Starts with either 0 or 91
//2. 2nd place should consist of either 6,7,8,9
//3. length should be 10 or 11 or 12. 
//Q. validate username
//Constraints:-
//1.starts with alphabets
//2.it should contain only character.(no special character but space is allowed)
//3.length should be b/w 6 to 50 character
//Q. validate password
//constraints:-
//1.Atleast contain a Capital letter
//2.Atleast contain a special character
//3.Atleast contain a digit
//4.Length should  b/w 8 to 20.
public class Validator {
	private static final String PHONE_NO = "6488644946";
	private static final String NAME = "shailmishra123";
	private static final String PASSWORD = "1A$dvcghr";

//Sh@il123y
	public static void main(String[] args) {
		String regExp = "^[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		String regExp1 = "^[6-9][0-9]{9}";
		String regExp2 = "^[6-9]\\d{9}";
		String regExp3 = "((0|91)?[6-9]\\d{9})";
		String regExp4 = "(0?(91)?[6-9]\\d{9})";
//		String nameRegEx="^([a-zA-Z]+)(\\s)?[a-zA-Z]{4,50}";
		String nameRegEx = "^(\\w+)(\\s)?\\w{4,50}";
		String pwdRegEx1 = "(?=[A-Z]+)";
		String pwdRegEx2 = "(?=[@#$_]+)";
		String pwdRegEx3 = "(?=[0-9]+)";
		String pwdRegEx4 = "\\w";
		String pwdRegExFinal = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@$_#]).{8,20})";
		String reg = ".";
		Pattern p = Pattern.compile(pwdRegExFinal);
		Matcher m = p.matcher(PASSWORD);
		if (m.find() && m.group().equals(PASSWORD)) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}

	}
}
