package com.step.Measurements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    @DisplayName("should return true if the two same type of quantities are equal")
    void isFeetEquals() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity feet1 = new Quantity(new BigDecimal(1), Unit.FEET);
        assertTrue(feet.equals(feet1));
        assertEquals(feet, feet1);
    }

    @Test
    @DisplayName("should return false if the two same type of quantities are not equal")
    void isFeetEquals1() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity feet1 = new Quantity(new BigDecimal(2), Unit.FEET);
        assertFalse(feet.equals(feet1));
    }

    @Test
    @DisplayName("should return true if two different type of quantities are equal")
    void isInchesEquals() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertTrue(feet.equals(inch));
    }

    @Test
    @DisplayName("should return false if two different type of quantities are not equal")
    void isInchesEquals1() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity inch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertFalse(feet.equals(inch));
    }

    @Test
    @DisplayName("should return true if inches are equal to centimeter")
    void isCentimeterEqual() {
        Quantity twoInch = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity fiveCentimeter = new Quantity(new BigDecimal(5), Unit.CM);
        assertTrue(twoInch.equals(fiveCentimeter));
    }

    @Test
    @DisplayName("should return true if millimeters are equal to centimeter")
    void isMillimeterEqual() {
        Quantity tenMM = new Quantity(new BigDecimal(10), Unit.MM);
        Quantity oneCentimeter = new Quantity(new BigDecimal(1), Unit.CM);
        assertTrue(tenMM.equals(oneCentimeter));
    }
}