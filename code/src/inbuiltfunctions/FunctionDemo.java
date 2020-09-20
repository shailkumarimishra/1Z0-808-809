package inbuiltfunctions;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
//	 R apply(T t);
Function<Integer,String> fun=(t)->{return String.valueOf(t);};
String result = fun.apply(10);
System.out.println(result);
Function<String,Integer> fun1=(t)->{return Integer.valueOf(t);};
Function<String, String> compose = fun.compose(fun1);
String result1 = compose.apply("100");
System.out.println(result1);
Function<Integer,Integer> fun2=(t)->{return t;};
Function<Integer,Integer>compose1=fun2.compose(fun1).compose(fun);
Integer result2 = compose1.apply(90);
System.out.println(result2);
Function<String,String> fun3=(t)->{return t;};
Function<Integer, String> result3 = fun2.andThen(fun);
System.out.println(result3);
Function<Object, Object> identity = Function.identity();
}
}
