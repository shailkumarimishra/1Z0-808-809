package generic;

import java.util.ArrayList;
import java.util.List;

public class Practice <T>{
public static <T extends Number> void method(T t) {
	
}
/*public void methodOne(ArrayList<Integer> i) {
	
}
public void methodOne(ArrayList<String> i) {
	
}*/
public static void main(String[] args) {
Practice<Integer> p=new Practice<>();
p.method(10);
List<Integer>li=new ArrayList<>();
List<String>li1=new ArrayList<>();
System.out.println(li);
System.out.println(li1);
//Practice<? super Number>p1=new Practice<>();//valid
}
}
