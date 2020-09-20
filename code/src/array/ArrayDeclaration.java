package array;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int[] a ;
		char[][] b;
		long[][][] c;
//		int[][] a,[][] b;//error
		int [][] u,t;
		int []d;
		int[]e [];
		int [] [] []g ;
		//System.out.println(a);
		char[][]x=new char[3][2];
		x[0][0]='a';
		x[0][1]='b';
		x[1][0]='c';
		x[1][1]='d';
		x[2][0]='e';
		x[2][1]='f';
		for(char i[]:x) {
			for(char j:i) {
			System.out.println(j);


	}

}
}
}