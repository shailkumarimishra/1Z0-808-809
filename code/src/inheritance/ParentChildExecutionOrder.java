package inheritance;

public class ParentChildExecutionOrder extends ParentExecutionOrder {
		
		int a1;
		static float f1 = m5();
		String sh="shaily";
		long l1 = m6();
		static double d1 = 100.3;

		{
			int b1 = 2;
			System.out.println("This is 1st instance bolck of child class" + " " + b1);
			b1++;
		}
		static {
			
			System.out.println("This is 1st static block of child class");
		}

		public static void m1() {
			System.out.println("This is 1st static method of child class " + " " + d1);
		}

		{
			System.out.println(l1 + "This is 2nd instance block of child class");
		}

		public void m2() {
			System.out.println("This is 1st instance method of child class" + " " + sh);
		}

		public static int m5() {
			System.out.println("This is 2nd static method of child class");
			return 47;
		}

		public ParentChildExecutionOrder() {
			System.out.println("This is constructor of child class" + " " + a1);
		}

		static {
			System.out.println(f1 + " " + "This is 2nd static block of child class");
		}

		public int m6() {
			System.out.println("This is 2nd instance method of child class");
			return 50;
		}

		

	


	public static void main(String[] args) {
		ParentChildExecutionOrder child=new ParentChildExecutionOrder();
		m1();
		child.m2();
		m5();
		child.m6();

	}

}
