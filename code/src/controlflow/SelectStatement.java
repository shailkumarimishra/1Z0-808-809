package controlflow;

public class SelectStatement {
	public static void test(int...b) {
	int sum=0;
		for (int a:b) {
		sum=sum+a;
	}
		System.out.println(sum);
	}
	public static void main(String...args) {
		if(true)
			System.out.println("hello");//allowed
		//if(10<20)
			//int a;//not allowed
		if(10<5);
		System.out.println("hii");
		int [] a= {10,20,30};
		test(a);
//test(-20,39,56,78);
		
	}
	
	

}
