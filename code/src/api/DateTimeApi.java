package api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

public class DateTimeApi {
public static void main(String[] args) {
	Date date=new Date(); 
	System.out.println(date);
	LocalDate localdate=LocalDate.now();
	System.out.println(localdate);
	LocalTime localtime=LocalTime.now();
	System.out.println(localtime);
	LocalDateTime localdatetime=LocalDateTime.now();
	System.out.println(localdatetime);
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
	LocalDateTime comingMidnight = LocalDateTime.of(LocalDate.now().plusDays(1),LocalTime.MIDNIGHT);
	System.out.println(comingMidnight);
	LocalTime now = LocalTime.now();
	Duration between = Duration.between(now,comingMidnight);
	System.out.println(between);
	Set<String> availableZoneIds = ZoneOffset.getAvailableZoneIds();
	System.out.println(availableZoneIds);
	ZonedDateTime zoneDateTime = ZonedDateTime.of(localdate, localtime, zone);
	System.out.println(zoneDateTime);
	LocalTime of = LocalTime.of(2, 30, 40, 200000000);
	String format = DateTimeFormatter.ISO_TIME.format(of);
	System.out.println(format);
	DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String format2 = ofPattern.format(LocalDate.of(2020,06,03));
	System.out.println(format2);
	LocalDate manufactureDate = LocalDate.of(2018,Month.MARCH,15);
	 LocalDate expiryDate = LocalDate.of(2021, Month.JULY, 20);
	 Period expire = Period.between(expiryDate,manufactureDate);
	 System.out.println(expire);
	 
}
}
