package practisetest_II;
import java.util.Arrays;

public class ArrayQ6 {

	public static void main(String[] args) {
		int ints[][]=new int[2][];
		ints[1]=new int[] {1,5,0};
		Arrays.sort(ints[1]);//here,trying to sort ints array whose specified array reference is null.so here we haven't initialized ints[1],so it is null.
		System.out.println(Arrays.toString(ints[1]));

	}

}
