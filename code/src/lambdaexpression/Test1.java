package lambdaexpression;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String []arr) {
		Set<Employee>set=new TreeSet<>();
		Employee e1=new Employee(11,"shail","mishra",2400000);
		Employee e2=new Employee(22,"aiman","oroos",230000);
		Employee e3=new Employee(33,"ankit","mishra",2400000);
		Employee e4=new Employee(44,"aiman","fatima",120000);
		Employee e5=new Employee(55,"shail","mishra",2500000);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		for(Employee e:set) {
			System.out.println(e);
		}
		
	}
}
