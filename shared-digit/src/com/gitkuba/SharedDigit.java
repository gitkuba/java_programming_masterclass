package com.gitkuba;

public class SharedDigit {
  public static boolean hasSharedDigit(int a, int b){
    if (a < 10 || a > 99 || b < 10 || b > 99){
      return false;
    }

    int remainderA = 0;
    int remainderB = 0;
    while (a != 0) {
      remainderA = a % 10;
      a /= 10;
      int bclone = b;
      while (bclone != 0){
        remainderB = bclone % 10;
        bclone /= 10;
        if (remainderA == remainderB) return true;
      }
    }

    return false;
  }
}
