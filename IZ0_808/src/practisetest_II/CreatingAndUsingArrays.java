package practisetest_II;

//Q4
public class CreatingAndUsingArrays {
	public static void main(String[] arr) {
		/*
		 * here, defining an integer array with 'final' modifier doesn't mean that all values in the array are final.It means that only reference are final.
		 */
		final int[] ints = new int[3];
		ints[1]++;
		for (int i : ints)
			System.out.print(i);
	}
}