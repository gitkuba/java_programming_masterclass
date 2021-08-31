package com.gitkuba;

public class Mitsubishi extends Car {

  public Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return Mitsubishi.class + " | The car's engine is starting";
  }

  @Override
  public String accelerate() {
    return Mitsubishi.class + " | The car is accelerating";
  }

  @Override
  public String brake() {
    return Mitsubishi.class + " | The car is braking";
  }
}
