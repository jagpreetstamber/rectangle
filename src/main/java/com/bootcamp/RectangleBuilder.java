package com.bootcamp;


public class RectangleBuilder {

  private int length;
  private int breadth;

  private RectangleBuilder() {
  }

  public static RectangleBuilder getInstance() {
    return new RectangleBuilder();
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }

  public Rectangle buildRectangle() {
    return Rectangle.createRectangle(length, breadth);
  }

  public Rectangle buildSquare() {
    return Rectangle.createSquare(length);
  }
}
