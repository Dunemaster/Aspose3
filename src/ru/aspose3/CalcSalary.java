package ru.aspose3;

import java.math.BigDecimal;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Salary Calculator.
 */

public class CalcSalary {
    // First Work Date
	java.sql.Date startDate;
	// Last Work Date
	java.sql.Date endDate;
	// Base Salary Rate
	int baseSalaryRate;
	// Max Percent of Base Salary Rate
	short maxPercentBaseSalaryRate;
	// Percent add to salary for every working year
	short percentPerWorkYear;
	// Additional add percent to salary for subordinates first level
	BigDecimal percentPerSubordinatesFirstLevel;
	// Additional add percent to salary for subordinates first level
	BigDecimal percentPerSubordinatesOtherLevels;
	
	public CalcSalary() {
		
	}
}
