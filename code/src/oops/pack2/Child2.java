package oops.pack2;

import oops.pack1.Parent;

public class Child2 extends Parent {
public static void main(String[] args) {
	Parent p=new Parent();
	p.m3();
	Child2 child=new Child2();
	child.name="kala";
	child.a=90;
	child.m3();
//	child.m1();
	child.m2();
}
}
