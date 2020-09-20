package practisetest_II;

public class EncapsulationQ19 {
	static int x=2;
	static int z;
	public static void main(String []arr) {
		System.out.println(x+z);
	}
	
	static{
		int x=3;
		z=x;
	}

}
