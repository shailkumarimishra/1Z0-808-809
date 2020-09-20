package lambdaexpression;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
	public static void main(String []arr) {
	List<Employee1> li = new ArrayList<>();
	Employee1 e1 = new Employee1(1, "shail", 240000, LocalDate.now());
	Employee1 e2 = new Employee1(3, "anjali", 230000, LocalDate.of(2015, 12, 3));
	Employee1 e3 = new Employee1(3, "sanjali", 330000, LocalDate.of(2016, 12, 3));
	Employee1 e4 = new Employee1(4, "manjali", 430000, LocalDate.of(2017, 12, 3));
	Employee1 e5 = new Employee1(4, "manjali", 230000, LocalDate.of(2015, 12, 3));
	Employee1 e6 = new Employee1(5, "patanjali", 230000, LocalDate.of(2018, 12, 3));
	Employee1 e7 = new Employee1(5, "patanjali", 230000, LocalDate.of(2019, 12, 3));
	Employee1 e8 = new Employee1(2, "ambe", 230000, LocalDate.of(2015, 12, 3));
	Employee1 e9 = new Employee1(6, "ambe", 230000, LocalDate.of(2015, 12, 3));
	Employee1 e10 = new Employee1(7, "anu", 230000, LocalDate.of(2015, 12, 3));
	li.add(e1);
	li.add(e2);
	li.add(e3);
	li.add(e4);
	li.add(e5);
	li.add(e6);
	li.add(e7);
	li.add(e8);
	li.add(e9);
	li.add(e10);
	Collections.sort(li,EmployeeSort.sortBySalary);
	li.forEach(System.out::println);
	
	} 
}
