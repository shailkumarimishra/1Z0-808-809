package lambdaexpression;
import java.util.Comparator;

public class EmployeeSort{
public static Comparator<Employee1> sortByEid=new Comparator<Employee1>() {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.geteId()-e2.geteId();
	}
	
};
public static Comparator<Employee1> sortByeName=new Comparator<Employee1>(){

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.geteName().compareTo(e2.geteName());
	}
	
};

public static Comparator<Employee1> sortByeDOB=new Comparator<Employee1>() {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.geteDOB().compareTo(e2.geteDOB());
	}
	
};
public static Comparator<Employee1> sortBySalary=new Comparator<Employee1>() {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		int i=(int)(e1.getSalary()-e2.getSalary());
		if(i==0) {
			int j=e1.geteName().compareTo(e2.geteName());
			if(j==0) {
				return e1.geteDOB().compareTo(e2.geteDOB());
			}
			return j;
		}
		return i;
	}
	
};

}
