package com.gitkuba;

public class FirstLastDigitSum {
  public static int sumFirstAndLastDigit(int number){
    if (number == 0) return 0;
    if (number < 0) return -1;
    int last = number % 10;
    int first = number;
    while (true) {
      if (first < 10) break;
      first /= 10;
    }

    return first + last;
  }
}
