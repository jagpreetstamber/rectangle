package com.bootcamp.builder;

import com.bootcamp.Rectangle;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class SquareBuilder extends Builder {

  public SquareBuilder setSide(int side) {
    length = side;
    return this;
  }

  public Rectangle build() {
    return new Rectangle(length, length);
  }
}
