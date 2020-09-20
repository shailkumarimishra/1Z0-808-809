package operators;

public class Example1 {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println(x++);//10
		System.out.println(++y);//21
		int a=10;
		a=a++ +a + a-- -a-- + a++;//31
		System.out.println(a);

	}

}
