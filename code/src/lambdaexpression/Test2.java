package lambdaexpression;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
	public static void main(String []arr) {
		List<Student2>set=new ArrayList<>();
		Student2 s1=new Student2(1,"shail","mishra",90000);
		Student2 s2=new Student2(2,"anjali","jatav",1000);
		Student2 s3=new Student2(3,"ankit","mishra",4500);
		Student2 s4=new Student2(6,"ambe","kalawati",8720);
		Student2 s5=new Student2(4,"anu","dubey",0000);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		Collections.sort(set,Sort.sortbyphone );
		set.forEach(System.out::println);
	}

}
