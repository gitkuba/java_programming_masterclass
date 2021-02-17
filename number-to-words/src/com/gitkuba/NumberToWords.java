package com.gitkuba;

public class NumberToWords {
  public static int getDigitCount(int number){
    if (number < 0) return -1;
    int count = 1;
    while (number > 9){
      number /= 10;
      count++;
    }

    return count;
  }

  public static int reverse(int number){
    int reversed = 0;
    boolean negative = false;

    if (number < 0) {
      negative = true;
      number *= -1;
    }

    while(number != 0){
      reversed *= 10;
      int remainder = number % 10;
      number /= 10;
      reversed += remainder;
    }

    if (negative) reversed *= -1;
    return reversed;
  }

  public static void numberToWords(int number){
    if(number < 0) {
      System.out.println("Invalid Value");
    }

    if (number == 0) System.out.println("Zero");

    int reversed = reverse(number);
    int digitCountOriginal = getDigitCount(number);
    int digitCountreversed = getDigitCount(reversed);

    while (reversed != 0) {
      int lastDigit = reversed % 10;
      reversed /= 10;
      switch(lastDigit) {
        case 0: System.out.println("Zero"); break;
        case 1: System.out.println("One"); break;
        case 2: System.out.println("Two"); break;
        case 3: System.out.println("Three"); break;
        case 4: System.out.println("Four"); break;
        case 5: System.out.println("Five"); break;
        case 6: System.out.println("Six"); break;
        case 7: System.out.println("Seven"); break;
        case 8: System.out.println("Eight"); break;
        case 9: System.out.println("Nine"); break;
      }
    }

    if (digitCountOriginal > digitCountreversed) {
      for (int i = 0; i < digitCountOriginal - digitCountreversed; i++){
        System.out.println("Zero");
      }
    }

  }


}