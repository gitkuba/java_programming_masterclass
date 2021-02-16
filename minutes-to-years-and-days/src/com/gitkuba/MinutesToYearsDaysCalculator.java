package com.gitkuba;

public class MinutesToYearsDaysCalculator {
  private static final String INVALID = "Invalid value";
  public static void printYearsAndDays(long minutes){
    if (minutes < 0) {
      System.out.println(INVALID);
    }

    long years = minutes / 60 / 24 / 365;
    long remainingMinutes = minutes % 60 * 24 * 365;
    System.out.println(minutes + " minutes = " + years + " y and " + remainingMinutes / 60 / 24 + " days");
  }
}
