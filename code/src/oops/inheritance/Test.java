package oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Person person=new Person();
		person.name="kala";
		Student stu=new Student();
		stu.name="shradha";
		Person.personCount=2;
		Student.personCount=4;
		System.out.println(person.getName()+" "+stu.getName());//kala anu
//		System.out.println(Person.getPersonCount()+" "+Student.getPerson());//4 4
		Person d=new Student();
	}

}
