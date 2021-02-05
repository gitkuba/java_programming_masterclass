package com.gitkuba;

public class Main {

  public static void main(String[] args) {
    boolean isAlien = false;

    if (isAlien == false) {
      System.out.println("It is not an alien!");
    }

    double myDouble = 20.00d;
    double secondDouble = 80.00d;

    double result = (myDouble + secondDouble) * 100.00d;

    double remainder = result % 40.00d;

    boolean isRemainderZero = remainder == 0;

    System.out.println(isRemainderZero);

    if (!isRemainderZero) {
      System.out.println("Got some remainder");
    }
  }
}
