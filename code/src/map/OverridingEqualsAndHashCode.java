package map;
/*
 * Q why we need to override equals() and hashCode() methods?
 * Ans-> In Set or Map if we are using custom class then we must override equals() and hashCode() method otherwise in Set duplicate values are allowed or in Map we can put the records but 
 * we can't retrieve the record.
 * SET
 * case 1:
 * if we don't override equals() and hashCode() then we are allowed to add duplicate records
 * case 2: 
 * if we override equals()method but not hashCode() method then also we are allowed to add duplicate records
 * case 3:
 * if we override hashCode()method but not equals() method then also we are allowed to add duplicate records
 * case 4(******):
 * if we don't override hashCode() properly but equals() method properly then also we are allowed to add duplicate records
 * case 5:
 * if we don't override equals() properly but hashCode() method properly then also we are allowed to add duplicate records
 * case 6:
 * if we override equals() and hashCode() method properly then duplicate records are not allowed.
 */

import java.util.HashSet;
import java.util.Set;

import lambdaexpression.Student2;

public class OverridingEqualsAndHashCode {

	public static void main(String[] args) {
		Set<Student2> set=new HashSet<>();
		Student2 s1=new Student2(1,"shail","mishra",90000);
		Student2 s2=new Student2(2,"anjali","jatav",1000);
		Student2 s3=new Student2(3,"ankit","mishra",4500);
		Student2 s4=new Student2(6,"ambe","kalawati",8720);
		Student2 s5=new Student2(4,"anu","dubey",90000);
		Student2 s6=new Student2(4,"anu","dubey",90000);
		Student2 s7=new Student2(4,"anu","dubey",90000);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.forEach(System.out::println);
		
		

	}

}
