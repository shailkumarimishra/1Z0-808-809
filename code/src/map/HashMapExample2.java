package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
public static void main(String[] args) {
	Map<Student,String> map=new HashMap<>();
	map.put(new Student("A"),"Shail");
	map.put(new Student("A"),"Shradha");
	map.put(new Student("B"),"Anu");
	map.put(new Student("C"),"Anjali");
	map.put(new Student("D"),"Ambe");
	System.out.println(map.size());
	System.out.println(map.get(new Student("A")));
}
}
