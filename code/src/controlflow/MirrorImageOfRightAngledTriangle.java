package controlflow;

public class MirrorImageOfRightAngledTriangle {
	public static void mirrorImageOfRightTriangle() {
		int rc=5;
		int sc=5;
		for (int i=1;i<=rc;i++) {
			for(int j=1;j<=sc;j++) {
				System.out.print("*");
			}sc--;
			System.out.println(" ");
			
		}
	}

	public static void main(String[] args) {
		mirrorImageOfRightTriangle(); 

	}

}
