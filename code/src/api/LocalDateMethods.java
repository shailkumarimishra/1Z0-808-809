package api;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.chrono.Era;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public class LocalDateMethods {

	public static void main(String[] args) {
		
		
		// ofXY()
		LocalDate of = LocalDate.of(2016, 2, 29);
		LocalDate withYear3 = of.withYear(2015);
		System.out.println(withYear3);// 2020-02-12
		LocalDate of2 = LocalDate.of(2020, Month.APRIL, 23);
		System.out.println(of2);// 2020-04-23
		LocalDate ofYearDay = LocalDate.ofYearDay(2020, 323);
		System.out.println(ofYearDay);// 2020-11-18
		LocalDate ofEpochDay = LocalDate.ofEpochDay(1);
		System.out.println(ofEpochDay);// 1970-01-02
		// fromXY()
		LocalDate from = LocalDate.from(LocalDate.of(2020, 2, 1));
		System.out.println(from);// 2020-02-01
		// parse()
		LocalDate parse = LocalDate.parse("2020-03-09");
		System.out.println(parse);//2020-03-09
		LocalDate parse1 = LocalDate.parse("03 Dec 2020", DateTimeFormatter.ofPattern("dd MMM uuuu"));
		System.out.println(parse1);//2020-12-03
		//create():private static create(int yr,int month,int day);
		//isXY()
		boolean supported = parse.isSupported(ChronoField.YEAR_OF_ERA);
		boolean supported2 = parse.isSupported(ChronoUnit.CENTURIES);
		System.out.println(supported2);
		System.out.println((parse.isLeapYear())? "is leap year":"not a leap year");
		boolean after = parse.isAfter(LocalDate.of(2020,03,06));
		System.out.println(after);
		boolean before = parse.isBefore(LocalDate.of(2020, 03,10));
		System.out.println(before);
		boolean equal = parse.isEqual(parse1);
		System.out.println(equal);
		//range(TemporalField field):ValueRange
		ValueRange range = parse.range(ChronoField.DAY_OF_YEAR);
		ValueRange range2 = parse.range(ChronoField.YEAR_OF_ERA);
		System.out.println(range);//1-366
		//getXY()
		int i = parse.get(ChronoField.DAY_OF_MONTH);
		System.out.println(i);//9
		IsoChronology chronology = parse.getChronology();
		System.out.println(chronology);//ISO
		Era era = parse.getEra();
		System.out.println(era);//CE
		int year = parse.getYear();
		System.out.println(year);//2020
		int monthValue = parse.getMonthValue();
		System.out.println(monthValue);//3
		Month month = parse.getMonth();
		System.out.println(month);//MARCH
		int dayOfMonth = parse.getDayOfMonth();
		System.out.println(dayOfMonth);//9
		int dayOfYear = parse.getDayOfYear();
		System.out.println(dayOfYear);//69
		DayOfWeek dayOfWeek = parse.getDayOfWeek();
		System.out.println(dayOfWeek);//MONDAY
		//lengthXY()
		int lengthOfMonth = parse.lengthOfMonth();
		System.out.println(lengthOfMonth);//31
		int lengthOfYear = parse.lengthOfYear();
		System.out.println(lengthOfYear);//366
		//withXY()
		LocalDate with = parse.with(parse1);
		System.out.println(with);//2020-12-03
		LocalDate with2 = parse.with(ChronoField.DAY_OF_MONTH,23);
		System.out.println(with2);//2020-03-23
		LocalDate withYear = parse.withYear(2021);
		System.out.println(withYear);//2021-03-09
		LocalDate withYear2 = LocalDate.of(2020, 02, 29).withYear(2021);
		System.out.println(withYear2);//2021-02-28
		LocalDate withMonth = parse.withMonth(4);
		System.out.println(withMonth);//2020-04-09
		LocalDate withMonth2 = LocalDate.of(2020, 05, 30).withMonth(2);
		System.out.println(withMonth2);//2020-02-29
		LocalDate withDayOfMonth = parse.withDayOfMonth(15);
		System.out.println(withDayOfMonth);//2020-03-15
//		LocalDate withDayOfMonth2 = withMonth2.withDayOfMonth(30);
//		System.out.println(withDayOfMonth2);//DateTimeException
		LocalDate withDayOfYear = parse.withDayOfYear(366);
		System.out.println(withDayOfYear);//2020-12-31
//		LocalDate withDayOfYear2 = LocalDate.of(2021, 4, 30).withDayOfYear(366);
//		System.out.println(withDayOfYear2);//DateTimeException
		//plusXY()
		LocalDate plus = parse.plus(Period.ofDays(5));
		System.out.println(plus);//2020-03-14
		LocalDate plus2 = parse.plus(30,ChronoUnit.DAYS);
		System.out.println(plus2);//2020-04-08....note No Exception
		LocalDate plusYears = parse.plusYears(3);
		System.out.println(plusYears);
		LocalDate plusMonths = LocalDate.of(2020, 3, 31).plusMonths(3);
		System.out.println(plusMonths);//2020-06-30
		LocalDate plusMonths2 = plusMonths.plusMonths(-6);
		System.out.println(plusMonths2);//2019-12-30
		LocalDate plusMonths3 = parse.plusMonths(21);
		System.out.println(plusMonths3);//2021-12-09
		LocalDate plusWeeks = parse.plusWeeks(2);
		System.out.println(plusWeeks);//2020-03-23
		LocalDate plusDays = parse.plusDays(25);
		System.out.println(plusDays);//2020-04-03
		//minusXY()
		LocalDate minus2 = parse.minus(Period.ofDays(15));
		System.out.println(minus2);//2020-02-23
		LocalDate minus = parse.minus(Period.ofDays(-1));
		System.out.println(minus);//2020-03-10
		LocalDate minus3 = parse.minus(20,ChronoUnit.DAYS);
		System.out.println(minus3);//2020-02-18
		LocalDate minusYears = parse.minusYears(3000);
		System.out.println(minusYears);//-0980-03-09
		//adjustInto()
		Temporal adjustInto = parse.adjustInto(LocalDate.of(2019, 2, 23));
		System.out.println(adjustInto);//2020-03-09...opposite of with()...
		//until()
		Period until = parse.until(LocalDate.of(2020, 2, 1));
		System.out.println(until);//P-1M-8D
		long until2 = parse.until(parse1,ChronoUnit.DAYS);
		System.out.println(until2);//269
		//format()
		String format = parse.format(DateTimeFormatter.ofPattern("d-MMM-yyyy"));
		System.out.println(format);//9-Mar-2020
		//atXY()
	}

}
