package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
	/**	int a=10;
		int b=30;
		int c=45;
		System.out.println(a<b);//true
	System.out.println(a<b<c);//not allowed**/
		
//ternary Operator/conditional operator
		String value = 10>20 ? "Gandi aatma" : "Anjali";
		System.out.println(value);//Anjali
		//Nested conditional operator
		String values=10>20 ? "Gandi Atama" : 10<20 ? "Anajli" :"Shail";
		System.out.println(values);//Anjali
		String result=10>20 ? "Gandi Atama" : 10<20 ? (20<10 ? "Dukhi Atama" : "Anjali") : "Anjali";
		System.out.println(result);//Anjali
	}

}