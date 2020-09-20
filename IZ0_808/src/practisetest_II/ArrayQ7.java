package practisetest_II;

import java.util.Arrays;

public class ArrayQ7 {
	public static void main(String []args){
		int[]ints= {2,-1,4,5,3};
		Arrays.sort(ints);
		System.out.println(Arrays.binarySearch(ints,-1));//it returns the index of the element if found,suppose element is not found then it returns index value <0.
	}
}
