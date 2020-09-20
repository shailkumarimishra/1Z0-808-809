package lambda;
@FunctionalInterface
public interface InterF {
public abstract String m1(int a,String b);
//public abstract int m2();
public default void m3() {
	System.out.println("Lambda example");
}
public static int m4() {
	return 10;
}

public static void main(String[] args) {
	InterF f=null;

}
}
