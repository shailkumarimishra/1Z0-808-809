package innerclass;

public class Test {
public static void main(String[] args) {
//	how to access inner class members?
	/*Outer o=new Outer();
	Outer.Inner i=o.new Inner();
	i.m1();
	
	Outer.Inner i1=new Outer().new Inner();
	i1.m1();
	new Outer().new Inner().m1();
	
	Shradha.Shail obj2= new Shradha.Shail();
	obj2.m1();
	obj2.m2();
	new Shradha.Shail().m1();*/
	Anjali ob=new Anjali();
	System.out.println(ob.a);
	/*Anjali a1 = new Anjali() {
		public int m1() {
			return 300;
		}
	};*/
//	System.out.println(a1.m1());
	
}

}
