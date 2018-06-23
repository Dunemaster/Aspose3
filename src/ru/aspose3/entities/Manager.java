package ru.aspose3.entities;

import java.math.BigDecimal;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Additional Parameters of Manager.
 */

public class Manager extends BaseStaffParameters {
  // Percent add to salary for every working year
  short percentPerWorkYear = 5;
  // Max percent of Base rate add to salary
  short maxPercentForBaseRate = 40;
  // Additional add percent to salary for subordinates first level
  BigDecimal percentPerSubordinatesFirstLevel = BigDecimal.valueOf(0.5);
}