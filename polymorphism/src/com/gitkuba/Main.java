package com.gitkuba;

public class Main {

  public static void main(String[] args) {
    Car car = new Car(6, "Mitsubishi Galant");
    Ford ford = new Ford(6, "Mitsubishi Galant");
    Holden holden = new Holden(6, "Mitsubishi Galant");
    Mitsubishi mitsubishi = new Mitsubishi(6, "Mitsubishi Galant");

    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());

    System.out.println(holden.startEngine());
    System.out.println(holden.accelerate());
    System.out.println(holden.brake());

    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());
  }
}
