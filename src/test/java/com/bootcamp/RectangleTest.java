package com.bootcamp;

import com.bootcamp.builder.RectangleBuilder;
import com.bootcamp.builder.SquareBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

  private Rectangle rectangle;
  private Rectangle square;

  private int length;
  private int breadth;

  @Before
  public void setUp() {
    length = 3;
    breadth = 2;

    rectangle = new RectangleBuilder().setLength(length).setBreadth(breadth).build();
    square = new SquareBuilder().setSide(length).build();
  }

  @Test
  public void testRectangleAreaIsCorrect() throws Exception {
    int expectedArea = length * breadth;
    int actualArea = rectangle.getArea();

    Assert.assertEquals(actualArea, expectedArea);
  }

  @Test
  public void testSquareAreaIsCorrect() throws Exception {
    int expectedArea = length * length;
    int actualArea = square.getArea();

    Assert.assertEquals(actualArea, expectedArea);
  }

  @Test
  public void testRectangleAreaIsInCorrect() throws Exception {
    int length = 5;
    int breadth = 10;
    Rectangle rect = new RectangleBuilder().setLength(length).setBreadth(breadth).build();

    int areaOfFirstRectangle = rectangle.getArea();
    int areaOfSecondRectangle = rect.getArea();

    Assert.assertNotEquals(areaOfFirstRectangle, areaOfSecondRectangle);
  }

  @Test
  public void testSquareAreaIsInCorrect() throws Exception {
    int length = 5;

    Rectangle sq = new SquareBuilder().setSide(length).build();

    int areaOfFirstSquare = square.getArea();
    int areaOfSecondSquare = sq.getArea();

    Assert.assertNotEquals(areaOfFirstSquare, areaOfSecondSquare);
  }


  @Test
  public void testRectanglePerimeterIsCorrect() throws Exception {

    int expectedPerimeter = 2 * (length + breadth);
    int actualPerimeter = rectangle.getPerimeter();

    Assert.assertEquals(actualPerimeter, expectedPerimeter);
  }

  @Test
  public void testSquarePerimeterIsCorrect() throws Exception {

    int expectedPerimeter = 4 * length;
    int actualPerimeter = square.getPerimeter();

    Assert.assertEquals(actualPerimeter, expectedPerimeter);
  }

  @Test
  public void testRectanglePerimeterIsInCorrect() throws Exception {
    int length = 5;
    int breadth = 10;

    Rectangle rect = new RectangleBuilder().setLength(length).setBreadth(breadth).build();

    int perimeterOfFirstRectangle = rectangle.getPerimeter();
    int perimeterOfSecondRectangle = rect.getPerimeter();

    Assert.assertNotEquals(perimeterOfFirstRectangle, perimeterOfSecondRectangle);
  }

  @Test
  public void testSquarePerimeterIsInCorrect() throws Exception {
    int length = 5;
    Rectangle sq = new SquareBuilder().setSide(length).build();

    int perimeterOfFirstSquare = square.getPerimeter();
    int perimeterOfSecondSquare = sq.getPerimeter();

    Assert.assertNotEquals(perimeterOfFirstSquare, perimeterOfSecondSquare);
  }

  @Test
  public void testIfRectangleWithSameLengthAndBreadthIsASquareWithSameLengthAreEqual() throws Exception {
    int length = 5;
    int breadth = 5;
    Rectangle rectangle = new RectangleBuilder().setLength(length).setBreadth(breadth).build();
    Rectangle square = new SquareBuilder().setSide(length).build();

    int squareArea = square.getArea();
    int rectangleArea = rectangle.getArea();
    int squarePerimeter = square.getPerimeter();
    int rectanglePerimeter = rectangle.getPerimeter();
    boolean areEqual = rectangle.equals(square);

    Assert.assertTrue(areEqual);
    Assert.assertEquals(squareArea, rectangleArea);
    Assert.assertEquals(squarePerimeter, rectanglePerimeter);
  }

  @Test
  public void testTwoUnequalRectanglesAreNotEqual() throws Exception {
    int length = 2;
    int breadth = 3;

    Rectangle rectangle1 = new RectangleBuilder().setBreadth(breadth).setLength(length).build();

    boolean areEqual = rectangle.equals(rectangle1);

    Assert.assertFalse(areEqual);
  }
}