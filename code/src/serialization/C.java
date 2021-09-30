package serialization;

import java.io.Serializable;

public class C implements Serializable{
private int a=10;
private String b="anu";
private static int c=100;
private transient String d="Data Structure";
public int getA() {
	return a;
}
public String getB() {
	return b;
}
public static int getC() {
	return c;
}
public String getD() {
	return d;
}


}
