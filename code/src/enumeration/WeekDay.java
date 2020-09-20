package enumeration;

public enum WeekDay {
//SUN,MON,TUES,WED;
	
	SUN("Sunday"),MON("Monday"),TUES("Tuesday");
	private String day;
	
	private WeekDay(String day) {
		this.day=day;
	}
	
	public String getDay() {
		return day;
	}
	
}
