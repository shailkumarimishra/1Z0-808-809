package lambda;

import java.util.ArrayList;
import java.util.function.ObjIntConsumer;
import java.util.stream.Stream;

public class Practice {
public static void main(String[] args) {
	ObjIntConsumer<Integer> obj=(Integer i,int l)->System.out.println(i+l);
	ArrayList<? extends Number> l5 = new ArrayList<Integer>();//valid
	ArrayList<? super Number> l6 = new ArrayList<>();//valid
}
}
