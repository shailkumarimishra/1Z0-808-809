package methodsandencapsulation;

public class Student {
	private int rollNo;
	private String name;
	private int age;

	public Student(int rollNo, String name, int age) {
		
		super();
		checkAge(age);
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentAge() {
		return age;
	}

	public void setStudentAge(int studentAge) {
		checkAge(studentAge);
		this.age = studentAge;
	}

	private void checkAge(int studentAge) {
		if (studentAge<18) {
			throw new IllegalArgumentException("Age should not be negative");

		}
	}

}
