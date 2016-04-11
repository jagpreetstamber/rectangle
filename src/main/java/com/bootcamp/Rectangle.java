package com.bootcamp;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class Rectangle {

  private int length;
  private int breadth;

  public Rectangle(int length, int breadth) {
    this.breadth = breadth;
    this.length = length;
  }

  public int getArea() {
    return length * breadth;
  }

  public int getPerimeter() {
    return 2 * (length + breadth);
  }
}
