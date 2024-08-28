package javaFeatures;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate l = LocalDate.of(2024, 9, 11);
		System.out.println(l);
		String d1 = "2024-09-11";
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(d1);
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern(d1);
		System.out.println(t);
		
		Instant i1 = Instant.now();
		System.out.println(i1);
		
		Period  p = Period.ofDays(10);
		System.out.println(p);
		System.out.println(Period.ofMonths(3));
		System.out.println(Period.ofWeeks(4));
		System.out.println(Period.ofYears(1));
	}
}
