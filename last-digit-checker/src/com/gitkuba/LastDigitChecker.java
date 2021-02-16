package com.gitkuba;

public class LastDigitChecker {
  public static boolean hasSameLastDigit(int a, int b, int c){
    if (!isValid(a) || !isValid(b) || !isValid(c)) return false;

    return a % 10 == b % 10 || b % 10 == c% 10 || a % 10 == c % 10;
  }

  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }
}
