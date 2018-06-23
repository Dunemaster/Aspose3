package ru.aspose3.entities;

import java.math.BigDecimal;

/**
 * @author Strigunov Gennady
 * @version 1.0
 * Basic parameters of staff.
 */
public class BaseStaffParameters {
  // FIO of Staff
  public String fio;
  // First working Date
  public java.sql.Date entryDate;
  // Base rate of salary
  public int baseSalaryRate;
  // Max Percent of Base Salary Rate
  public short maxPercentBaseSalaryRate;
  // Percent add to salary for every working year
  public short percentPerWorkYear;
  // Additional add percent to salary for subordinates first level
  public BigDecimal percentPerSubordinatesFirstLevel;
  // Additional add percent to salary for subordinates first level
  public BigDecimal percentPerSubordinatesOtherLevels;
}