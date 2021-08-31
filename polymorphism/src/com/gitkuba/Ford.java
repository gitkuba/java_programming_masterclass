package com.gitkuba;

public class Ford extends Car {

  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return Ford.class + " | The car's engine is starting";
  }

  @Override
  public String accelerate() {
    return Ford.class + " | The car is accelerating";
  }

  @Override
  public String brake() {
    return Ford.class + " | The car is braking";
  }
}
