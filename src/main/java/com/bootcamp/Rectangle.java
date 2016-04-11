package com.bootcamp;


/**
 * Created by Jagpreet on 11/04/16.
 */
public class Rectangle {

  private int length;
  private int breadth;

  private Rectangle(int length, int breadth) {
    this.breadth = breadth;
    this.length = length;
  }

  public int getArea() {
    return length * breadth;
  }

  public int getPerimeter() {
    return 2 * (length + breadth);
  }

  public static Rectangle createSquare(int side) {
    return new Rectangle(side, side);
  }

  public static Rectangle createRectangle(int length, int breadth) {
    return new Rectangle(length, breadth);
  }

  @Override
  public boolean equals(Object obj) {
    boolean isEqual;
    if(obj instanceof Rectangle) {
      isEqual = (length == ((Rectangle) obj).length) && (breadth == ((Rectangle) obj).breadth);
    } else {
      isEqual = false;
    }
    return isEqual;
  }
}
