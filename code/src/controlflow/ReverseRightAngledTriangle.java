package controlflow;

public class ReverseRightAngledTriangle {
	public static void reverseRightTriangle() {
		int rc = 5;
		int sc = 1;
		int bsc = 4;
		for (int i = 1; i <= rc; i++) {
			for (int j = 1; j <= bsc; j++) {
				System.out.print(" ");
			}bsc--;
			for(int k=0;k<sc;k++)
			{
				System.out.print("*");
			}sc++;
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		reverseRightTriangle();
	}

}
