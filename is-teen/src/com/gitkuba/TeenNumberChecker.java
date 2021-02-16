package com.gitkuba;

public class TeenNumberChecker {
  public static boolean hasTeen(int a, int b, int c) {
    return isTeen(a) || isTeen(b) || isTeen(c);
  }

  public static boolean isTeen(int n){
    return n >= 13 && n <= 19;
  }
}
