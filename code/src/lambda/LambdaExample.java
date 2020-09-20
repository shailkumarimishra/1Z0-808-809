package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaExample {

public static void main(String[] args) {
//	public abstract int m1(int a);
//	InterF f=(a)->{return a;};
//	InterF f=(a)-> a;
//	int result = f.m1(20);
//	System.out.println(result);
//	public abstract int add(int a, int b);
	InterF2 f2=(a,b)->{return (a+b);};
	InterF2 f3=(a,b)->a+b;
	InterF2 f4=(a,b)->{int c=a+b; return c;};
	InterF2 f5=(int a,int b)->a+b;
	System.out.println(f2.add(10, 20));
	System.out.println(f3.add(30, 40));
	System.out.println(f4.add(60, 50));
	System.out.println(f5.add(70, 90));
	
//	public void m1();
	InterF1 f6=()->{System.out.println("Iam shradha");};
	f6.m1();
	InterF1 f7=()->System.out.println("Iam shail");
	f7.m1();
//	boolean test(T t);
	Predicate<Integer> p=(a)->a%2==0;
	boolean test = p.test(23);
	System.out.println(test);
	List<Integer>l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
//	removeIf(Predicate<? super E> filter)
	Predicate<Integer> filter=(a)->{return a>30;};
	l1.removeIf(filter);
	System.out.println(l1);
	
//	  R apply(T t);
	UnaryOperator<Integer> fun=(a)->{return 10;};
	l1.replaceAll(fun);
	System.out.println(l1);
}
}
