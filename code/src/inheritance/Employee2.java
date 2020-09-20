package inheritance;

public class  Employee2 extends SalaryOrganiser {
	
	public  double calculateTotalIncome() {
		System.out.println(a);
		return getSalary()+bonus();
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 20_000;
	}

	@Override
	public int bonus() {
		// TODO Auto-generated method stub
		return 1000;
	}
	/**public static void main(String[] args) {
		Employee2 obj=new Employee2();
		obj.calculateTotalIncome();
	}**/
}
