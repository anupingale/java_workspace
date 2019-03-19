package com.step.bootCamp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    @DisplayName("should return area of square given side as integer.")
    void areaOfSquareWithIntegers() throws Exception {
        Dimension side = new Dimension(2);

        Square square = new Square(side);
        assertEquals(square.calculateArea(), 4);
    }

    @Test
    @DisplayName("should return area of square given side as double.")
    void areaOfSquareWithFloat() throws Exception {
        Dimension side = new Dimension(2.5);
        Square square = new Square(side);
        assertEquals(square.calculateArea(), 6.25);
    }

    @Test
    @DisplayName("should return perimeter of square given side as integer.")
    void perimeterOfSquareWithIntegers() throws Exception {
        Dimension side = new Dimension(2);
        Square square = new Square(side);
        assertEquals(square.calculatePerimeter(), 8);
    }

    @Test
    @DisplayName("should return perimeter of square given side as double.")
    void perimeterOfSquareWithFloat() throws Exception {
        Dimension side = new Dimension(2.5);
        Square square = new Square(side);
        assertEquals(square.calculatePerimeter(), 10);
    }

}