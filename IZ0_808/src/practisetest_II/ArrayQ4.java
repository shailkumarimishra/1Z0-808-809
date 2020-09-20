package practisetest_II;

public class ArrayQ4 {
	public static void main(String []arr) {
		final int[] ints=new int[3];
//		ints=new int[4]; applying final keyword on array states that the array reference are final not the value of the array.
		int len=ints.length;
		ints[1]++;
		for(int i:ints) {
			System.out.println(i);
		}
	}
}
