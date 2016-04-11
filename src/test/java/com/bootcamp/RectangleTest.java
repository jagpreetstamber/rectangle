package com.bootcamp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class RectangleTest {

  private Rectangle rectangle;

  private static final int LENGTH = 2;
  private static final int BREADTH = 3;

  @Before
  public void setUp() {
    rectangle = new Rectangle(LENGTH, BREADTH);
  }


  @Test
  public void getArea() throws Exception {
    int area = rectangle.getArea();

    Assert.assertEquals(area, LENGTH * BREADTH);
  }

  @Test
  public void getPerimeter() throws Exception {
    int area = rectangle.getPerimeter();

    Assert.assertEquals(area, 2 * (LENGTH + BREADTH));
  }

}