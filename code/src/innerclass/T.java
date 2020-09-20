package innerclass;

public class T {
static int y=1;
public static void main(String[] args) {
	abstract class C{
		abstract int cal(int x);
	}
	C c=new C() {

		@Override
		int cal(int x) {
			return x-y;
		}
		
	};
	System.out.println(c.cal(2));
}
}
