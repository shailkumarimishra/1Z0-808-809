package practisetest_II;

public class EncapsulationQ55 {
public static void main(String[] arr) {
	EncapsulationQ55 obj=new EncapsulationQ55();
	Print p=new Print();
	// insert here
	p.p2(6);
//	System.out.println(p.print(6)); boolean type println is not applicable for void arguments
}
}

class Print{
	static void p2(int i) {
		System.out.println(i*2);
	}
	void print(int i) {
		System.out.println(i);
	}
}