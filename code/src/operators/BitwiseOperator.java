package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println(8&5);
		System.out.println(6|4);
		System.out.println(3^2);
 	/** System.out.println(8 & 5);//0
		System.out.println(8 | 5);//13
		System.out.println(8 ^ 5);//13
		System.out.println(true & false);//false
		System.out.println(true & true);//true
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		System.out.println(false | false);//false
		System.out.println(false | true);//true
		System.out.println(true | false);//true
		System.out.println(true | true);//true
		System.out.println(false ^ false);//false
		System.out.println(false ^ true);//true
		System.out.println(true ^ false);//true
		System.out.println(true ^ true);//false**/
		// (~) Tild
		System.out.println(~9);//-10 TRICK:- for +ve value increase it by 1 and put -ve sign
		System.out.println(~-9);//8 TRICK :- for -ve value decrease it by 1 and put +ve sign
		//boolean comliment(!) only for boolean not for integeral
		System.out.println(false &! true);//false
		System.out.println(false &! false);//false
		System.out.println(true &! true);//false
		System.out.println(true &! false);//true
		System.out.println(false |! true);//false
		System.out.println(false |! false);//true
		System.out.println(true |! true);//true
		System.out.println(true |! false);//true
		System.out.println(true ^! true);//true
		System.out.println(true ^! false);//false
		System.out.println(false ^!true);//false
		System.out.println(false ^! false);//true
	
	}

}
