package com.gitkuba;

public class Main {

    public static void main(String[] args) {
	// byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + " \u00A9 2021";
        System.out.println(myString);

        String ten = "10";
        int myInt = 50;
        System.out.println(ten + myInt);

        // Strings are immutable (each time new string is created, old one is purged from memory).
    }
}
