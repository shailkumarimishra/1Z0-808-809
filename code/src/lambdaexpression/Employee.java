package lambdaexpression;

public class Employee implements Comparable {
	private int e_id;
	private String first_name;
	private String last_name;
	private double salary;
	
	public Employee(int e_id, String first_name, String last_name, double salary) {
		super();
		this.e_id = e_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		last_name = last_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		int diff=(int)(this.salary-e.salary);
		if(diff==0) {
			return this.first_name.compareTo(e.first_name);
		}
		return diff;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", first_name=" + first_name + ", Last_name=" + last_name + ", salary="
				+ salary + "]";
	}

	
	
	


}
