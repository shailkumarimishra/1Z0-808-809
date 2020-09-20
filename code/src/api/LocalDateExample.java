package api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		System.out.println(localdate);
		System.out.println(localdate.getYear()+" "+localdate.getMonth());
		System.out.println(localdate.getDayOfWeek()+" "+localdate.getDayOfMonth()+" "+localdate.getDayOfYear());
		LocalDate localdate1=LocalDate.of(2019, Month.NOVEMBER, 25);
		System.out.println(localdate1.getDayOfWeek());
		System.out.println(localdate1.isLeapYear());
		System.out.println(localdate1.get(ChronoField.DAY_OF_WEEK));
		System.out.println(localdate1.getEra());
		System.out.println(localdate1.plusDays(28));
		System.out.println(localdate1.minusMonths(4));
		System.out.println(localdate1.plusDays(8));
		
		System.out.println(localdate.until(localdate.of(2020, 5, 27), ChronoUnit.MONTHS));
	    LocalDate with = localdate.with(ChronoField.ALIGNED_WEEK_OF_YEAR,12);
		System.out.println(with.getDayOfWeek());
//		LocalDate with = localdate.withDayOfMonth(22);
//		System.out.println(with);
		System.out.println(ZoneId.getAvailableZoneIds().size());
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(customFormat.format(LocalDate.of(2019,Month.MARCH,01)));//01/03/2019**/
	}

}
