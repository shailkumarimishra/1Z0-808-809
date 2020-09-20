package streamapi;

import java.time.LocalDate;

public class Student {
private int sid;
private String stuName;
private int stuPhone;
private String stuState;
private int stuSem;
private int stuYear;
private LocalDate dob;
private Double cgpa;
private String stuBranch;
public Student(int sid, String stuName, int stuPhone, String stuState, int stuSem, int stuYear, LocalDate dob,
		Double cgpa, String stuBranch) {
	super();
	this.sid = sid;
	this.stuName = stuName;
	this.stuPhone = stuPhone;
	this.stuState = stuState;
	this.stuSem = stuSem;
	this.stuYear = stuYear;
	this.dob = dob;
	this.cgpa = cgpa;
	this.stuBranch = stuBranch;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getStuName() {
	return stuName;
}

public void setStuName(String stuName) {
	this.stuName = stuName;
}

public int getStuPhone() {
	return stuPhone;
}

public void setStuPhone(int stuPhone) {
	this.stuPhone = stuPhone;
}

public String getStuState() {
	return stuState;
}

public void setStuState(String stuState) {
	this.stuState = stuState;
}

public int getStuSem() {
	return stuSem;
}

public void setStuSem(int stuSem) {
	this.stuSem = stuSem;
}

public int getStuYear() {
	return stuYear;
}

public void setStuYear(int stuYear) {
	this.stuYear = stuYear;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public Double getCgpa() {
	return cgpa;
}

public void setCgpa(Double cgpa) {
	this.cgpa = cgpa;
}

public String getStuBranch() {
	return stuBranch;
}

public void setStuBranch(String stuBranch) {
	this.stuBranch = stuBranch;
}

@Override
public String toString() {
	return ""+sid+" "+stuName+" "+stuPhone+" "+stuState+" "+stuSem+" "+stuYear+" "+cgpa+" "+dob+" "+stuBranch;
}

}
