package com.gitkuba;

public class FlourPacker {
  public static boolean canPack(int bigCount, int smallCount, int goal){
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }

    int packed = 0;

    while(bigCount > 0 || smallCount > 0){
      if (bigCount > 0 && (goal - packed >= 5)) {
        packed += 5;
        bigCount--;
      } else if(smallCount > 0 && (goal - packed > 0)) {
        packed += 1;
        smallCount --;
      } else {
        break;
      }
    }

    return packed == goal;
  }
}