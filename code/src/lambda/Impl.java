package lambda;

public class Impl{
//@Override
	public void m3() {
		System.out.println("Impl");
	}

public static void main(String[] args) {
	InterF in=(a,b)->a+b;
	System.out.println(in.m1(10,"shail"));
	Impl i =new Impl();
	i.m3();
}

}
