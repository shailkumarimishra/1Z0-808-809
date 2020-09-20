package practisetest_II;

public class ArrayQ37 {
	public static void main(String []arr) {
		int[]a= {1,2,3,4,5,6};
		for(int i=0,j=0;i<a.length;j++) {
			i=a[j];
			System.out.print(i+" ");
		}
		//or
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
