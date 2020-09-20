package Array.tests;

public class Q4 {

	public static void main(String[] args) {
		int array[][] = new int[2][];
		array[0]=new int[3];
		array[1]=new int[3];
		array[0][0] = 0;
		array[0][1] = 1;
		array[0][2] = 2;

		array[1][0] = 0;
		array[1][1] = 10;
		array[1][2] = 20;

		System.out.println(array[1][1]);
	}

}
