package com.gitkuba;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("min double value = " + myMinDoubleValue);
        System.out.println("max double value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5d;

        double ratio = 0.45359237;
        int pounds = 4;
        double kilograms = pounds * ratio;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
