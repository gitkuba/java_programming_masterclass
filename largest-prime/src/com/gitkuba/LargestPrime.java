package com.gitkuba;

public class LargestPrime {
  public static int getLargestPrime(int number) {
    if (number < 2) return -1;

    int largestPrimeFactor = -1;

    for(int i = 1; i <= number; i++) {
      if (number % i == 0 ) {
        boolean isPrime = true;
        for(int j=2;j<i;j++){
          if(i % j == 0) {
            isPrime = false;
          }
        }
        if (isPrime) largestPrimeFactor = i;
      }
    }
    return largestPrimeFactor;
  }
}
