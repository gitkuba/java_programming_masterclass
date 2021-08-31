package com.gitkuba;

public class Point {
  private int x;
  private int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public double distance() {
    return Math.sqrt(x*x + y*y);
  }

  public double distance(int x, int y) {
    double xDiff = x - this.x;
    double yDiff = y - this.y;
    return Math.sqrt(Math.pow(xDiff, 2)+Math.pow(yDiff, 2));
  }

  public double distance(Point point) {
    double xDiff = point.getX() - this.x;
    double yDiff = point.getY() - this.y;
    return Math.sqrt(Math.pow(xDiff, 2)+Math.pow(yDiff, 2));
  }
}
