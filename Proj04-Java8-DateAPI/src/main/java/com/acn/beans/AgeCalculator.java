package com.acn.beans;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now().withYear(1992).withMonth(1).withDayOfMonth(5);
		LocalDate dob = date.withYear(1992).withMonth(8).withDayOfMonth(1);
		Period p = Period.between(date, dob);
		System.out.println(p.getDays());

		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dt2 = dt.plusHours(25).plusMinutes(30);
		System.out.println(Duration.between(dt, dt2).abs());

	}

}
