package com.bootcamp.builder;

import com.bootcamp.Rectangle;

/**
 * Created by Jagpreet on 11/04/16.
 */
public abstract class Builder {

  protected int length;
  protected int breadth;

  public abstract Rectangle build();
}
