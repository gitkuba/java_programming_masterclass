package com.gitkuba;

public class BarkingDog {
  public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
    return hourOfTheDay >= 0 && hourOfTheDay <= 23 && (hourOfTheDay > 22 || hourOfTheDay < 8) && barking;
  }
}
