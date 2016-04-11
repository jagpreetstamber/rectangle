package com.bootcamp;

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

  @Override
  public boolean equals(Object obj) {
    boolean isEqual;
    if (obj instanceof Rectangle) {
      isEqual = (length == ((Rectangle) obj).length) && (breadth == ((Rectangle) obj).breadth);
    } else {
      isEqual = false;
    }
    return isEqual;
  }
}
