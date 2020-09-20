package inheritance;

public class PolymorphismTest {
	public static void main(String[] args) {
		
		Parent1 p=new Child1();
		System.out.println(p.a);//10
		System.out.println(p.m2(20));// child = 20 20
		p.m1();//child1 m1()
//		p.m4();
	    Object result=p.m3("Anjali1");
	    System.out.println(result);//   Anjali1
	    p.m5();//m5() child
	    p.m6();//m6()parent
	    p.m7();//m7() of parent class
//	    Child1 c=(Child1)p;
//	    c.m8();//m8() or
	    ((Child1)p).m8();
	    
	    
		

	}
}
