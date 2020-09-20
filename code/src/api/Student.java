package api;

public final class Student {
	private final int rollno;
	private final String name;
	private final Address address;

	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address ad=new Address(address.getCity(),address.getState(),address.getPhoneNo());
		return ad;
	}



}
