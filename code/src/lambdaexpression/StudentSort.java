package lambdaexpression;
import java.util.Comparator;
public class StudentSort implements Comparator<Student2>{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		int i = s1.getfirstName().compareTo(s2.getfirstName());
		if(i==0) {
			return s1.getLastName().compareTo(s2.getLastName());
		}
		return i;
	}

}
