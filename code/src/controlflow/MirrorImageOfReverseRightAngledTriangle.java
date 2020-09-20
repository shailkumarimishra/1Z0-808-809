package controlflow;

public class MirrorImageOfReverseRightAngledTriangle {
	public static void mirrorImageOfRightTriangle() {
		int rc=5;
		int bsc=1;
		int sc=5;
		for(int i=1;i<=rc;i++) {
			for(int j=1;j<=bsc;j++) {
				System.out.print(" ");
			}bsc++;
			for(int k=1;k<=sc;k++) {
				System.out.print("*");
			}sc--;
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		mirrorImageOfRightTriangle();

	}

}
