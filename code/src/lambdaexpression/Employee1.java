package lambdaexpression;
import java.time.LocalDate;
public class Employee1 {
private int eId;
private String eName;
private double salary;
private LocalDate eDOB;
public Employee1(int eId, String eName, double salary, LocalDate eDOB) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.salary = salary;
	this.eDOB = eDOB;
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate geteDOB() {
	return eDOB;
}
public void seteDOB(LocalDate eDOB) {
	this.eDOB = eDOB;
}
@Override
public String toString() {
	return "Employee1 [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", eDOB=" + eDOB + "]";
}


}
