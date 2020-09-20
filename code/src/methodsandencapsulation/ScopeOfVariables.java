package methodsandencapsulation;

public class ScopeOfVariables {
int x;//scope throughout the class except static block and static method.
static int y;//scope throughout the class.
String s1;//same as (primitive) instance variable scope.
static String s2;//scope throughout the class.
{
System.out.println(y);	
}
public  void m1() {
	System.out.println(x);
	System.out.println(y);
}
static {
//System.out.println(x);
//System.out.println(s1);
}
public static void m2() {
//	System.out.println(x);
	System.out.println(s2);
}
}
