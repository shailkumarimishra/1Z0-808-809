package controlflow;

public class ValleyPattern {
	static void m1() {
		int blank_space_count=7;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<=blank_space_count;k++) {
				System.out.print(" ");
			}blank_space_count-=2;
			for(int z=0;z<=i;z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
