package com.bootcamp.builder;

import com.bootcamp.Rectangle;

public abstract class Builder {

  protected int length;
  protected int breadth;

  public abstract Rectangle build();
}
