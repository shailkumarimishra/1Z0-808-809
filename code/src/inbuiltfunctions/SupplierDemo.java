package inbuiltfunctions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
//	    T get();
		Random r=new Random();
		Supplier<Integer> sup=()->{return r.nextInt(5);};
		Integer output = sup.get();
		System.out.println(output);
	}

}
