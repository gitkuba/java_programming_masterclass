package com.gitkuba;

public class NumberPalindrome {
  public static boolean isPalindrome(int number) {
    number = Math.abs(number);
    int reversed = 0;
    int elo = number;
    int remainder = 0;
    while (elo != 0) {
      reversed *= 10;
      remainder = elo % 10;
      elo /= 10;
      reversed += remainder;
    }

    return reversed == number;
  }
}
