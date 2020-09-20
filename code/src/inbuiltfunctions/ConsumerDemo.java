package inbuiltfunctions;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
//		void accept(T t);
		Consumer<String> con=(t)->{System.out.println(t);};
		con.accept("ambe");
		Consumer<String> con1=(t)->{System.out.println(t.concat("420"));};
		Consumer<String> con3 = con.andThen(con1);
		con3.accept("shail");
	}

}
