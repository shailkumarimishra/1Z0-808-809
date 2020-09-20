package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

import java.time.LocalDate;
import java.time.Period;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 Q3. filter those students who studies in 3rd year and belongs to "Bihar"?
 Q4. group Students by branch?
 Q5. group Students by branch and their semester?
 Q6. sort Students by name?
 Q7. find the Student whose cgpa is maximum?
 Q8. find the Student whose cgpa is minimum
 Q9. find those Students whose cgpa is > 8.0?
 Q10. find those Students whose age is between 20 to 25?
 Q11. sort Students by cgpa (descending order) ?
 Q12. select top 10 Students(cgpa)?
  */
public class StreamAPIDemo {
public static List<Student> getTestData(){
	List<Student> list = Arrays.asList(new Student(101,"Ambe", 22343,"Assam",6, 3,LocalDate.of(1993,11, 23),9.8,"CSE"),
									   new Student(102,"Shail",2343,"MP",6,3,LocalDate.of(1994, 10, 12),9.29,"CSE"),
									   new Student(103,"Shreya",1234,"MP",5,3,LocalDate.of(1995,9, 12),8.0,"IT"),
									   new Student(104,"Shradha",89323,"Assam",5,3,LocalDate.of(1990, 4, 6),8.8,"EC"),
									   new Student(105,"Sumedha",5675,"Bihar",5,3,LocalDate.of(1994,10,12),7.8,"IT"),
									   new Student(106,"Rohit",43322,"Chattisgarh",2,1,LocalDate.of(1990,4,6),8.8,"EC"),
									   new Student(107,"Saurav",2222,"Assam",2,1,LocalDate.of(1990,7,19),6.7,"EX"),
									   new Student(108,"Vishakha",6666,"Karnatka",1,1,LocalDate.of(2000, 11, 29),8.8,"ME"),
	                                   new Student(109,"Gyan",8876,"Chattisgarh",3,2,LocalDate.of(1998, 1,29),6.6,"EX"),
	                                   new Student(110,"Tammanna",8765,"Bihar",7,4,LocalDate.of(2000, 6,22),9.0,"ME"),
	                                   new Student(111,"Piya",5678,"Karnatka",7,4,LocalDate.of(1998, 9,20),7.6,"CE"),
	                                   new Student(112,"Shreya",4567,"Punjab",3,2,LocalDate.of(1997, 2,23),7.5,"CE"),
	                                   new Student(113,"Tiya",3456,"Haryana",1,1,LocalDate.of(2000,6,16),6.7,"CSE"),
	                                   new Student(114,"Gyan",3343,"MP",4,2,LocalDate.of(2001,12,12),8.9,"IT"),
	                                   new Student(115,"Shail",2222,"Kerala",4,2,LocalDate.of(1998,1,29),6.6,"EX"),
	                                   new Student(116,"Ambe",3333,"Bhopal",5,3,LocalDate.of(1994,10,12),9.9,"CE"),
	                                   new Student(117,"Shail",6666,"Karnatka",5,3,LocalDate.of(1990,4,6),8.7,"CSE"),
	                                   new Student(118,"Piya",44554,"Assam",4,2,LocalDate.of(1997,8, 18),7.9,"CSE"),
	                                   new Student(119,"Danish",7775,"kerala",8,4,LocalDate.of(1996,6, 18),8.1,"ME"),
	                                   new Student(120,"Ankit",44432,"Tamil Nadu",8,4,LocalDate.of(1997,8,15),7.5,"B.pharma"),
	                                   new Student(121,"Prashant",85756,"Tamil Nadu",2,1,LocalDate.of(1996,4,24),8.7,"B.pharma"),
	                                   new Student(122,"Aman",75745,"bhopal",5,3,LocalDate.of(1994,7,11),8.7,"CSE"),
	                                   new Student(123,"Lucky",758584,"Punjab",8,4,LocalDate.of(1997,7,13),6.6,"EC"),
	                                   new Student(124,"Sangeeta",66666,"Chandigarh",8,4,LocalDate.of(1996,6,12),6.5,"CE"),
	                                   new Student(125,"Anjali",2223,"Tamil Nadu",5,3,LocalDate.of(1998,2,27),8.9,"CSE"),
	                                   new Student(126,"Anu",3432,"Bihar",6,3,LocalDate.of(1999,3,7),6.7,"ME"),
	                                   new Student(127,"Yashaswi",90993,"Kerala",2,1,LocalDate.of(1998,9,19),9.8,"B.pharma"),
	                                   new Student(128,"Zessica",43423,"Punjab",1,1,LocalDate.of(1999,12,3),6.7,"CSE"),
	                                   new Student(129,"Piya",33222,"MP",1,1,LocalDate.of(2000,6, 22),7.8,"B.pharma"),
	                                   new Student(130,"Ankit",32323,"Bihar",7,4,LocalDate.of(1999,12, 23),8.9,"EX"));
	return list;
}
public static void main(String[] args) {
//	Q1. filter those students whose name starts with 'a'?
/*	List<Student> filterStudent=new ArrayList<>();
	for(Student stu:getTestData()) {
		if(stu.getStuName().startsWith("a")) {
			filterStudent.add(stu);
		}
	}*/
/*for(Student stu: filterStudent) {
	System.out.println(stu);
}*/
List<Student> list1 = getTestData();
Stream<Student> stream = list1.stream();
Predicate<Student> p=(s)->{return s.getStuName().startsWith("a");};
Stream<Student> filter = stream.filter(p);
List<Student> collect = filter.collect(toList());
//collect.forEach(System.out::println);

//getTestData().stream().filter(s->s.getStuName().startsWith("a")).collect(toList()).forEach(System.out::println);
	
	
//Q2. group the students by their state?
	Map<String, List<Student>> collect2 = getTestData().stream().collect(groupingBy(s->s.getStuState()));
//	collect2.forEach((k,v)->System.out.println(k+" "+v));
Map<String,List<Student>> map=new HashMap<>();
for(Student stu:getTestData()) {
if(map.containsKey(stu.getStuState())) {
	List<Student> list = map.get(stu.getStuState());
	list.add(stu);
	map.put(stu.getStuState(), list);
	}
else {
	List<Student> students=new ArrayList<>();
	students.add(stu);
	map.put(stu.getStuState(),students);
}
}
/*for(Map.Entry<String,List<Student>> e:map.entrySet()) {
	System.out.println(e.getKey()+" "+e.getValue());
}*/
//	 Q3. filter those students who studies in 3rd year and belongs to "Bihar"?
List<Student>stuInfo=new ArrayList<>();
	for(Student stu:getTestData()) {
		if(stu.getStuYear()==3 && stu.getStuState()=="Bihar") {
			stuInfo.add(stu);
		}
	}
	/*for(Student stu:stuInfo) {
		System.out.println(stu);
	}*/
	
//	Q4. group Students by branch?
	//imperative program
	Map<String,List<Student>> map1=new HashMap<>();
	for(Student stu:getTestData()) {
		if(map1.containsKey(stu.getStuBranch())) {
			List<Student>list=map1.get(stu.getStuBranch());
			list.add(stu);
			map1.put(stu.getStuBranch(),list);
		}
		else {
			List<Student> students=new ArrayList<>();
			students.add(stu);
			map1.put(stu.getStuBranch(),students);
		}
	}
	/*for(Map.Entry<String, List<Student>> m:map1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}*/
//	Declarative Programming
	Map<String, List<Student>> collect3 = getTestData().stream().collect(groupingBy(s->s.getStuBranch()));
//	collect3.forEach((k,v)->System.out.println(k+" "+v));
	
//	Q5. group Students by branch and their semester?
//	Q6. sort Students by name?
//	getTestData().stream().sorted().collect(toList()).forEach(System.out::println);
//Q7. find the Student whose cgpa is maximum?
	
//	Q9. find those Students whose cgpa is > 8.0?
//	getTestData().stream().filter((s)->{return s.getCgpa()>8.0;}).collect(Collectors.toList()).forEach(System.out::println);

//	Q10. find those Students whose age is between 20 to 25?
//	getTestData().stream().filter((s)->{Period dob=Period.between(s.getDob(),LocalDate.now()); 
//	return dob>LocalLocalDate.of(2000,3,11) && dob<LocalDate.of(1995,3,11);})
//	.collect(Collectors.toList());
	
	
//	Q11. sort Students by cgpa (descending order) ?	
	getTestData().stream().sorted(Comparator.comparing(Student::getCgpa).reversed()).collect(Collectors.toList()).forEach(System.out::println);
	
	
	
	
	
	
	
	
}
}
