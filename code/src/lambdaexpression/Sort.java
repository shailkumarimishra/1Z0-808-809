package lambdaexpression;
import java.util.Comparator;
public class Sort {
public static Comparator<Student2> sortbyname=new Comparator<Student2>() {

	@Override
	public int compare(Student2 s1, Student2 s2) {
		int i = s1.getfirstName().compareTo(s2.getfirstName());
		if(i==0) {
			return s1.getLastName().compareTo(s2.getLastName());
		}
		return i;
	}
	
};
public static Comparator<Student2> sortbysid=new Comparator<Student2>() {

	@Override
	public int compare(Student2 s1, Student2 s2) {
		return s1.getSid()-s2.getSid();
	}
	
};
public static Comparator<Student2> sortbyphone=new Comparator<Student2>(){

	@Override
	public int compare(Student2 s1, Student2 s2) {
		return s1.getPhone()-s2.getPhone();
	}
	
};
}
