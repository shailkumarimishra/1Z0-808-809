package inbuiltfunctions;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
//		 boolean test(T t);
		Predicate<String> pr=(t)->{return t.startsWith("s");};
		boolean result = pr.test("ambe");
		System.out.println(result);
		Predicate<String> pr1=(t)->{return t.endsWith("a");};
		Predicate<String> pr2 = pr.and(pr1);
		System.out.println(pr2.test("shailja"));
	}

}
