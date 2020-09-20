package array;

public class ThreeDArrayUsingDI {

	public static void main(String[] args) {
		int[][][] a= { { {10,20}, {30,40,50} },   {{60} ,{70,80,90}, {1}},   { {3,4} } };
		System.out.println(a[1][1][1]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}

	}

}
