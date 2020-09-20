package inheritance;

public  class Employee1 extends SalaryOrganiser {

public double CalculateTotalIncome() {
	
	return getSalary()+bonus();
}

@Override
public double getSalary() {
	// TODO Auto-generated method stub
	return 10_000;
}

@Override
public int bonus() {
	// TODO Auto-generated method stub
	return 500;
}
}
