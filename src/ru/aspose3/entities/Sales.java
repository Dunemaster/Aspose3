package ru.aspose3.entities;

import java.math.BigDecimal;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Additional Parameters of Sales.
 */

public class Sales extends BaseStaffParameters {
	  // Percent add to salary for every working year
	  short percentPerWorkYear = 1;
	  // Max percent of Base rate add to salary
	  short maxPercentForBaseRate = 35;
	  // Additional add percent to salary for subordinates first level
	  BigDecimal percentPerSubordinatesFirstLevel = BigDecimal.valueOf(0.3);
	  // Additional add percent to salary for subordinates first level
	  BigDecimal percentPerSubordinatesOtherLevels = BigDecimal.valueOf(0.3);
}