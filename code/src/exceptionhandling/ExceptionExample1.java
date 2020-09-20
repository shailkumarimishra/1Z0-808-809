package exceptionhandling;

public class ExceptionExample1 {
	public void m1() {
		int a = 20;
		try {
			a++;
//			System.out.println(10 / 0);
		} catch (Exception e) {
			a++;
		} finally {
			a++;
		}
		System.out.println(a);
	}

	public int m2() {
		int a = 10;
		try {
			a++;
			System.out.println(10 / 0);
			a++;
			return a;
		} catch (Exception e) {
			a++;
			return a;
		} finally {
			a++;
			return a;
		}
	}

	public int m3() {
		int a = 10;
		try {
			a++;
			System.out.println(10 / 0);
			a++;
			return a;
		} catch (Exception e) {
			a++;
			return a;
		} finally {
			a++;
		}
	}

	public static void main(String[] args) {
		ExceptionExample1 obj= new ExceptionExample1();
//		int a=obj.m3();
//		System.out.println(a);
		obj.m1();

	}

}
