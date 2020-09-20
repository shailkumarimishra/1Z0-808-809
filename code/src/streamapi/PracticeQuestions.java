package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
 Q13. find any student who belongs to "Bihar"?
 */

public class PracticeQuestions {

	public static void main(String[] args) {
		List<Student> students = StreamAPIDemo.getTestData();
//		 Q3. filter those students who studies in 3rd year and belongs to "Bihar"?
		Predicate<Student>p=(s)->{return s.getStuYear()==3 && s.getStuState().equals("Bihar");};
//		students.stream().filter(p).collect(Collectors.toList()).forEach(System.out::println);
//		  Q4. group Students by branch?
		Map<String, List<Student>> grpByBranch = students.stream().collect(Collectors.groupingBy(Student::getStuBranch));
		grpByBranch.forEach((k,v)->System.out.println(k+" "+v));
//		 Q6. sort Students by name?
//		int compare(T o1, T o2);
		Comparator<Student> compare=(s1,s2)->{return s1.getStuName().compareTo(s2.getStuName());};
//		students.stream().sorted(compare).collect(Collectors.toList()).forEach(System.out::println);
//		students.stream().map(Student::getStuName).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
//		method-2
//		students.stream().sorted(Comparator.comparing(Student::getStuName)).collect(Collectors.toList()).forEach(System.out::println);
//		Q7. find the Student whose cgpa is maximum?
		Student student = students.stream().sorted(Comparator.comparing(Student::getCgpa)).collect(Collectors.toList()).get(students.size()-1);
		System.out.println(student);
		Student student2 = students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed()).collect(Collectors.toList()).get(0);
		System.out.println(student2);
		Student student3 = students.stream().max(Comparator.comparing(Student::getCgpa)).get();
		System.out.println(student3);
//		Q12. select top 10 Students(cgpa)?
//		students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed()).limit(10).collect(Collectors.toList()).forEach(System.out::println);
//		 Q5. group Students by branch and their semester?
		 Map<String, Map<Integer, List<Student>>> group = students.stream().collect(Collectors.groupingBy(Student::getStuBranch,Collectors.groupingBy(Student::getStuSem)));
	/*	for(Map.Entry<String, List<Student>> map:group.entrySet()) {
			for(Student s:map.getValue()) {
				System.out.println(map.getKey()+" "+s.getSid()+" "+s.getStuName());
			}
		}*/
//		group.forEach((k,v)->System.out.println(k+" "+v);
//		group.forEach((k,v)->{v.forEach((s)->{System.out.println(k+" "+s.getSid()+" "+s.getStuName());});};});
//		group.forEach((k,v)->{v.forEach((s)->{System.out.println(k+" "+s.getSid()+" "+s.getStuName());});});
//		 group.forEach((k,v)->{(v.forEach((k1,v1)->{v1.});)});
		 group.forEach((k,v)->{
			 v.forEach((k1,v1)->{
				 v1.forEach((s)->{
					 System.out.println(k+" "+k1+" "+s.getSid()+" "+s.getStuName());
				 });
			 });
		 });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
