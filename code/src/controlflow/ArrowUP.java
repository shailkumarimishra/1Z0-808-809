package controlflow;

public class ArrowUP {
	static void m1() {
	int	blank_space_count=3;
	int blank_space_count1=3;
	int star_count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<blank_space_count;j++) {
				System.out.print(" ");
			}--blank_space_count;
			for(int k=0;k<=star_count;k++) {
				System.out.print("*");	
			}star_count+=2;
			for(int z=0;z<blank_space_count1;z++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int a=0;a<3;a++) {
			for(int b=0;b<2;b++) {
				System.out.print(" ");
			}
			for(int c=0;c<3;c++) {
				System.out.print("*");
			}
			for(int d=0;d<2;d++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
m1();
	}

}
