package com.acn.beans;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DateExample {
	public static void main(String[] args) {
		LocalDate tdate = LocalDate.now();
		System.out.println("Today's date: " + tdate);

		LocalDate ydate = tdate.minusDays(1);
		System.out.println("Yesterday's date: " + ydate);

		LocalDate tomorrowDate = LocalDate.now().plusDays(1);
		System.out.println("Tommorow's date: " + tomorrowDate);

		int day = tdate.getDayOfMonth();
		System.out.println("Day: " + day);

		int month = tdate.getMonthValue();
		System.out.println("Month: " + month);

		// Chronofield
		int day1 = tdate.get(ChronoField.DAY_OF_MONTH);
		System.out.println("Day chrono: " + day1);
		int year = tdate.get(ChronoField.DAY_OF_YEAR);
		System.out.println("Day of year: " + year);

		LocalDate local = tdate.withDayOfMonth(1).withMonth(8).withYear(2019);
		System.out.println(local.get(ChronoField.DAY_OF_WEEK));

		LocalDate leapcheck = LocalDate.of(2020, 12, 30);
		System.out.println("Is leap Year: " + leapcheck.isLeapYear());
	}

}
