package com.gitkuba;

public class Car {

  private boolean engine = true;

  private int cylinders;

  private String name;

  private int wheels = 4;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
  }

  public String startEngine() {
    return Car.class + " | The car's engine is starting";
  }

  public String accelerate() {
    return Car.class + " | The car is accelerating";
  }

  public String brake() {
    return Car.class + " | The car is braking";
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }
}
