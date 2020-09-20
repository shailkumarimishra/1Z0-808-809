package methodsandencapsulation;

public  class Employee {

	private String name;

	Employee(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String val) {
		name = val;
	}

	public static void swap(Employee e1, Employee e2) {
		Employee temp = e1;
		e1 = e2;
		e2 = temp;
	}
	public static void resetValueOfName(Employee e1){
		e1.setName("Anu");
		}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Kalawati");
		Employee emp2 = new Employee("Amit");
		System.out.println(emp1.getName() + ":" + emp2.getName());// Kalawati : Amit
		swap(emp1, emp2);
		System.out.println(emp1.getName() + ":" + emp2.getName());// Kalawati : Amit
		resetValueOfName(emp1);
		System.out.println(emp1.getName());//Anu

	}
}

