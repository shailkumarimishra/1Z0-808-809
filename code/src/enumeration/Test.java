package enumeration;

public class Test {
	
public static void main(String[] args) {
	for(WeekDay day:WeekDay.values()) {
		System.out.println(day.getDay());
	}
	System.out.println(Month.JAN.toString());
	System.out.println(Month.valueOf("JAN"));
	System.out.println(Month.JAN.ordinal());
	System.out.println(Level.HIGH.asLowerCase());
	System.out.println(WeekDay.SUN==WeekDay.MON);
}
}
