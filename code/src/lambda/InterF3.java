package lambda;

public interface InterF3 {
public abstract void m1();
public abstract void m2();
public default void m3() {
	System.out.println("InterF3");
}
public static void m4() {
	System.out.println("InterF3 static m4()");
}
public static void m5() {
	System.out.println("InterF3 static m5()");
}
}
