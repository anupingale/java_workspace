package com.step.bootCamp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("should return area of rectangle given length and breadth as integer.")
    void areaOfRectangleWithIntegers() throws Exception {
        Dimension length = new Dimension(2);
        Dimension breadth = new Dimension(5);

        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(rectangle.calculateArea(), 10);
    }

    @Test
    @DisplayName("should return area of rectangle given length and breadth as double.")
    void areaOfRectangleWithFloat() throws Exception {
        Dimension length = new Dimension(2.5);
        Dimension breadth = new Dimension(5.2);
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(rectangle.calculateArea(), 13.0);
    }

    @Test
    @DisplayName("should return perimeter of rectangle given length and breadth as integer.")
    void perimeterOfRectangleWithIntegers() throws Exception {
        Dimension length = new Dimension(2);
        Dimension breadth = new Dimension(5);
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(rectangle.calculatePerimeter(), 14);
    }

    @Test
    @DisplayName("should return perimeter of rectangle given length and breadth as double.")
    void perimeterOfRectangleWithFloat() throws Exception {
        Dimension length = new Dimension(2.5);
        Dimension breadth = new Dimension(5.2);
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(rectangle.calculatePerimeter(), 15.4);
    }
}