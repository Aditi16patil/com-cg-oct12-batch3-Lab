package com.cg.oct12.batch3.lab3.Q7;

import java.time.LocalDate;
import java.time.Period;

public class Exercise7 {
	public static void main(String[] args)
	{
		LocalDate pdate = LocalDate.of(1999, 8 ,01);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old", 
				diff.getYears(), diff.getMonths(), diff.getDays());
	}
}
