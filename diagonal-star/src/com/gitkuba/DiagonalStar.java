package com.gitkuba;

public class DiagonalStar {

  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");
      return;
    }
    int row = 1;

    while (row <= number) {
      int column = 1;
      while (column <= number) {
        if (row == 1 || row == number || column == 1 || column == number || row == column || column == number - row + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        column++;
      }
      System.out.print("\n");
      row++;
    }
  }
}
