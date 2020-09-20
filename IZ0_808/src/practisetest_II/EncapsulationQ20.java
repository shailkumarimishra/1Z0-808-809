package practisetest_II;

public class EncapsulationQ20 {
	static int count=0;
	EncapsulationQ20(){
		count++;
	}

	static int book(String book) {
		System.out.println(book);
		return count;
	}
	public static void main(String []arr) {
		EncapsulationQ20 obj1=new EncapsulationQ20();
		System.out.println(book("cd"));
		System.out.println(book("PM"));
	}

}
