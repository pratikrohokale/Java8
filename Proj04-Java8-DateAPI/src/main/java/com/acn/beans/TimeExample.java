package com.acn.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeExample {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDate dt2 = LocalDate.now();
		System.out.println("Current time is : " + time);
		int hr = time.getHour();
		System.out.println("Current hours: " + hr);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss", new Locale("HI", "IN"));
		String fdate = dt.format(formate);
		System.out.println(fdate);

		// calculate date difference/period
		LocalDate dt1 = LocalDate.now().plusDays(20);
		Period p1 = Period.between(dt1, dt2);
		System.out.println(p1);
		
	}

}
