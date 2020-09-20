package lambdaexpression;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingExample {

	public static void main(String[] args) {
		Set<Student> set= new TreeSet<>();
		Student s1=new Student(31,"shail",1234);
		Student s2=new Student(23,"shaily",123432);
		Student s3=new Student(53,"shailja",123456);
		Student s4=new Student(40,"anu",123466);
		Student s5=new Student(5,"ambe",123477);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.forEach(System.out::println);

	}

}
