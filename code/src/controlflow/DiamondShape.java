package controlflow;

public class DiamondShape {
	static void m1() {
		int blank_space = 2;
		int star_count = 0;
		int bs_count = 0;
		int s_count = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < blank_space; j++) {
				System.out.print(" ");
			}
			--blank_space;
			for (int k = 0; k <= star_count; k++) {
				System.out.print("*");
			}
			star_count += 2;
			System.out.println("");
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= bs_count; j++) {
				System.out.print(" ");
			}
			++bs_count;
			for (int k = 0; k < s_count; k++) {
				System.out.print("*");
			}
			s_count -= 2;
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		m1();
	}

}
