package practisetest_II;

public class ArrayQ5 {

	public static void main(String[] args) {
		int [][]ints=new int[3][2];
		ints[0]=new int[3];
		ints[2]=new int[] {1,2,3};
//		ints[2]= {1,2,3}; //array constants can only be used in initializer
		System.out.println(ints[0].length+ints[2].length);

	}

}
