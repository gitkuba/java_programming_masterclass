package com.gitkuba;

import java.util.Scanner;

public class InputCalculator {

  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int num = 0;
    long avg = 0;

    while (true) {
      if (scanner.hasNextInt()) {
       int number = scanner.nextInt();
        sum += number;
        num++;
        avg = Math.round((double) sum / num);
      } else {
        System.out.println("SUM = " + sum + " AVG = " + avg);
        break;
      }
    }
  }
}
