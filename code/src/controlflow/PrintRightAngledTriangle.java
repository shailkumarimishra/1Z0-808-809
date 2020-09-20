package controlflow;

public class PrintRightAngledTriangle {
	public static void rightAngleTriangle() {
		int rc=5;
		int sc=1;
		for(int i=0;i<rc;i++) {
			for(int j=0;j<sc;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			sc++;
		/**for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");**/
		}
	}

	public static void main(String[] args) {
	rightAngleTriangle();

	}

}
