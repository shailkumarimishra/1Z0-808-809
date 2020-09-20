package controlflow;

public class MirrorImageOfValley {
	static void m1() {
		int blank_space=0;
		for(int i=4;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=blank_space;k++) {
				System.out.print(" ");
			}blank_space+=2;
			for(int z=i;z>0;z--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
m1();
	}

}
