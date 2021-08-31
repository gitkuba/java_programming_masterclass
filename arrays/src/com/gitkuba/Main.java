package com.gitkuba;

public class Main {

  public static void main(String[] args) {
    int[] someIntArray = new int[10];
    someIntArray[5] = 50;
    System.out.println(someIntArray[5]);
    System.out.println(someIntArray[4]);

    //

    double[] someDoubleArray = new double[2];
    someDoubleArray[0] = 3.2;
    someDoubleArray[1] = 3.2;
    System.out.println(someDoubleArray[1]);

    //

    int[] someOtherIntArray = {1,2,3,4,5,6,7,8};
    System.out.println(someOtherIntArray[2]);
  }
}
