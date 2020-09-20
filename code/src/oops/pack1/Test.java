package oops.pack1;

public class Test {
public static void main(String[] args) {
	Parent p=new Child1();
	String m4 = p.m4("shail");
	System.out.println(m4);
	String[] s= {"anu","anjali"};
	Child1 child=(Child1)p;
	child.m4(s);
	p.m5(null);
	p.display("kala");
}
}
