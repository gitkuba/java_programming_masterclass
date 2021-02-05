package com.gitkuba;

public class Main {

  public static void main(String[] args) {
    int myValue = 10000;

    int myMiIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;

    System.out.println("Integer minimum value = " + myMiIntValue);
    System.out.println("Integer maximum value = " + myMaxIntValue);
    System.out.println("busted max = " + (myMaxIntValue + 1)) ;
    System.out.println("busted min = " + (myMiIntValue - 1));

    int myMaxIntTest = 2_147_483_647;

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println(myMaxByteValue);
    System.out.println(myMinByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println(myMaxShortValue);
    System.out.println(myMinShortValue);

    long myLongValue = 1000000000000000L;
    long myMinLongtValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println(myMinLongtValue);
    System.out.println(myMaxLongValue);

    byte myByteVar = 100;
    short myShortVar = 30000;
    int myIntVar = 2000000000;
    long myLongVar = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
    System.out.println(myLongVar);
  }
}
