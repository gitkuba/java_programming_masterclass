package com.gitkuba;

public class EvenDigitSum {
  public static int getEvenDigitSum(int number){
    if (number < 0) return -1;
    int evenSum = 0;
    int remainder = 0;
    while (number != 0) {
      remainder = number % 10;
      number /= 10;
      if (remainder % 2 == 0) evenSum += remainder;
    }

    return evenSum;
  }
}
