package ru.aspose3;

import java.util.Calendar;

import ru.aspose3.entities.Person;
import java.time.Year;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Salary Calculator.
 */
// 03.04.2016 - 12.04.2018
public class CalcSalary {
	
	public CalcSalary(Person person) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(person.entryDate);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(person.endDate);
		int cntMilSec = cal2.compareTo(cal1);
		int cntYears = cntMilSec;
		for (int i = cal1.get(Calendar.YEAR); i < cal2.get(Calendar.YEAR); i++) {
			if (Year.isLeap(cal))
              
		}
	}
}