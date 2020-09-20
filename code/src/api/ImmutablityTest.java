package api;

public class ImmutablityTest {

	public static void main(String[] args) {
		Address ad=new Address("Bhopal", "MP",1234567892);
		Student s=new Student(123,"Shail",ad );
		System.out.println(s.getAddress().getCity());
		Address address = s.getAddress();
		address.setCity("Patna");
		System.out.println(s.getAddress().getCity());
	}

}
