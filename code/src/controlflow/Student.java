package controlflow;

public class Student {
	String name;
	double tenthPercentage;
	double twelthPercentage;
	double cgpa;
	int backlog;

	public Student(String name, double tenthPercentage, double twelthPercentage, double cgpa, int backlog) {
		super();
		this.name = name;
		this.tenthPercentage = tenthPercentage;
		this.twelthPercentage = twelthPercentage;
		this.cgpa = cgpa;
		this.backlog = backlog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTenthPercentage() {
		return tenthPercentage;
	}

	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}

	public double getTwelthPercentage() {
		return twelthPercentage;
	}

	public void setTwelthPercentage(double twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getBacklog() {
		return backlog;
	}

	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}

}
