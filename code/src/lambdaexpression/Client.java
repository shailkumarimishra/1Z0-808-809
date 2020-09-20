package lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Student> li=new ArrayList<>();
		Student s1=new Student(1,"shail",1234);
		Student s2=new Student(2,"shaily",123432);
		Student s3=new Student(3,"shailja",123456);
		Student s4=new Student(4,"anu",123466);
		Student s5=new Student(5,"ambe",123477);
		Student s6=new Student(6,"anjali",123488);
		Student s7=new Student(7,"shradha",1234888);
		Student s8=new Student(8,"anjali",1234999);
		Student s9=new Student(9,"mahendra",1234000);
		Student s10=new Student(10,"sanjali",123224);
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
		/*Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		//Q1. Fetch those student whose name starts with A?
		/*List<Student> list=new ArrayList<>();
		for(Student st:li) {
			if(st.getName().startsWith("a")) {
				list.add(st);
				
			}
		}
		list.forEach(System.out::println);*/
//		Q2. Fetch those  students whose sid lies between 5 to 8?
	/*	List<Student> list1=new ArrayList<>();
		for(Student s:li) {
			if(s.getSid()>5 && s.getSid()<8) {
				list1.add(s);
			}
		}
		list1.forEach(System.out::println);*/
//		Q3. Update those students name whose name starts with "s" and length must be > 5 and update with "Java"?
		/*List<Student> list2=new ArrayList<>();
		for(Student s:li) {
			if(s.getName().startsWith("s") && s.getName().length()>5) {
				s.setName("Java");
				list2.add(s);
			}
		}
		list2.forEach(System.out::println);*/
//      Q4. Update all the students names  first character with upper letter?	
		List <Student> list3=new ArrayList<>();
		for(Student s:li) {
			s.setname(s.getname().substring(0,1).toUpperCase().concat(s.getname().substring(1)));
			
			list3.add(s);
		}
		list3.forEach(System.out::println);	

	}

}
