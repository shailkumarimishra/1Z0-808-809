package array;

public class TwoDArray {

	public static void main(String[] args) {
	/**	int[][] a=new int[3][2];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[0][0]);
		System.out.println(a.length);
		System.out.println(a[0].length);**/
		/*for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
		}*/
		/*for(int i[]:a) {
			for(int j:i) {
				System.out.println(j);
			}
		}*/
		int [][] b= {{10,20},{30,40,50},{60}};
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[0][1]);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		for(int []z:b) {
			for(int y=0;y<z.length;y++) {
				System.out.println(z[y]);
			}
			
		}

	}

}
