package com.bootcamp;

import com.bootcamp.shapes.Rectangle;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class RectangleBuilder {

  private int length;
  private int breadth;

  private RectangleBuilder() {}

  public static RectangleBuilder getInstance() {
    return new RectangleBuilder();
  }

  public void addLength(int length) {
    this.length =length;
  }

  public void addBreadth(int breadth) {
    this.breadth = breadth;
  }

  public Rectangle buildRectangle() {
    return Rectangle.createRectangle(length, breadth);
  }

  public Rectangle buildSquare() {
    return Rectangle.createSquare(length);
  }
}
