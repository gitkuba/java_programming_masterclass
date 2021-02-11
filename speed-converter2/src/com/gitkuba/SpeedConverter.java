package com.gitkuba;

public class SpeedConverter {
  public static long toMilesPerHour (double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    }

    return Math.round(kilometersPerHour / 1.609);
  }

  public static void printConversion(double kilometersPerHour){
    double miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
    if (miles == -1) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kilometersPerHour + " km/h = " + (long) miles + " mi/h");
    }
  }
}
