package datatypes;

import java.util.Stack;

public class NumberSystemConversions {
	private int binaryBase=2;
	private int decimalBase=10;
	private int octalBase=8;
	private int hexadecimalBase=16;
	private Stack<String> output;
	
 public void DecimalToBinary(int decimalNo) {
	 output= new Stack<>();
	 int num=decimalNo;
	 while(num!=0) {
		 int rem=num%binaryBase;
		 num=num/binaryBase;
		 output.add(String.valueOf(rem));
	 }
 }
 
 public void DecimalToOctal(int decimalNo) {
	 output=new Stack<>();
	 int num=decimalNo;
	 while(num!=0) {
		 int rem=num%octalBase;
		 num=num/octalBase;
		 output.add(String.valueOf(rem));
	 }
 }
 
 public void DecimalToHexaDecimal(int decimalNo) {
	 output=new Stack<>();
	 int num=decimalNo;
	 while(num!=0) {
		 int rem=num%hexadecimalBase;
		 num=num/hexadecimalBase;
		 if(rem>9 && rem<16)
			output.add(getHex(rem));
		 else
			 output.add(String.valueOf(rem));
	 }
 }
 
 private String getHex(int rem) {
	 switch(rem) {
	 case 10:
		 return "A";
	 case 11:
		 return "B";
	 case 12:
		 return "C";
	 case 13:
		 return "D";
	 case 14:
		 return "E";
	 case 15:
		 return "F";
	 }
	return null;
}

public void displayOutput() {
	 if(output.size()==0) {
		 System.out.println(0);
	 }
	 while(output.size()>0)
		 System.out.print(output.pop());
 }
	public static void main(String[] args) {
		NumberSystemConversions convert=new NumberSystemConversions();
//		convert.DecimalToBinary(18);
//		convert.displayOutput();
//		convert.DecimalToOctal(18);
//		convert.displayOutput();
		convert.DecimalToHexaDecimal(7562);
		convert.displayOutput();
	}

}
