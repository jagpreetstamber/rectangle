package com.bootcamp.builder;


import com.bootcamp.Rectangle;

public class RectangleBuilder extends Builder {

  public RectangleBuilder setLength(int length) {
    this.length = length;
    return this;
  }

  public RectangleBuilder setBreadth(int breadth) {
    this.breadth = breadth;
    return this;
  }

  public Rectangle build() {
    return new Rectangle(length, breadth);
  }
}
