package ru.aspose3.entities;

import java.math.BigDecimal;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Additional Parameters of Emploee.
 */

public class Emploee {
	  // Percent add to salary for every working year
	  short percentPerWorkYear = 3;
	  // Max percent of Base rate add to salary
	  short maxPercentForBaseRate = 30;
	  // Additional add percent to salary for subordinates first level
	  BigDecimal percentPerSubordinatesFirstLevel = null;
	  // Additional add percent to salary for subordinates first level
	  BigDecimal percentPerSubordinatesOtherLevels = null;
}
