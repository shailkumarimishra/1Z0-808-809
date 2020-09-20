package controlflow;

public class PrimeNo {
	public static boolean isPrimeNo(int a) {

		for (int i = 2; i <= (a - 1); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return a <= 1 ? false : true;
	}

	public static void main(String[] args) {
		boolean result = isPrimeNo(6);
		System.out.println(result);

	}

}
