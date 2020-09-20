package array;

public class ThreeDArray {

	public static void main(String[] args) {
		int[][][] a=new int[3][2][4];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}

	}

}
