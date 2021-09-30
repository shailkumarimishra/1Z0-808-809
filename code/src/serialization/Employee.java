package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID=123456L;
	private String name;
	private int age;
	private static double salary;
	private transient int leaveDays;

	public Employee(String name, int age, double salary,int leaveDays) {
		super();
		this.name = name;
		this.age = age;
		this.salary=salary;
		this.leaveDays = leaveDays;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static double getSalary() {
		return salary;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void setSalary(double salary) {
		Employee.salary = salary;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
	

}
