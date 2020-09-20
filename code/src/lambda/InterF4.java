package lambda;

public interface InterF4 extends InterF3 {
public abstract void m1();
public default void m3() {
	System.out.println("InterF4");
}
public static void m4() {
	System.out.println("InterF4 static m4()");
}
}
