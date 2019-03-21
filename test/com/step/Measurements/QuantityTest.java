package com.step.Measurements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    @DisplayName("should return true if the two same type of quantities are equal")
    void isFeetEquals() {
        Quantity feet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity feet1 = new Quantity(new BigDecimal(1), Unit.FEET);
        assertEquals(feet, feet1);
    }

    @Test
    @DisplayName("should return false if the two same type of quantities are not equal")
    void isFeetEquals1() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twoFeet = new Quantity(new BigDecimal(2), Unit.FEET);
        assertNotEquals(oneFeet, twoFeet);
    }

    @Test
    @DisplayName("should return true if two different type of quantities are equal")
    void isInchesEquals() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    @DisplayName("should return false if two different type of quantities are not equal")
    void isInchesEquals1() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity oneInch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertNotEquals(oneFeet, oneInch);
    }

    @Test
    @DisplayName("should return true if inches are equal to centimeter")
    void isCentimeterEqual() {
        Quantity twoInch = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity fiveCentimeter = new Quantity(new BigDecimal(5), Unit.CM);
        assertEquals(twoInch, fiveCentimeter);
    }

    @Test
    @DisplayName("should return true if millimeters are equal to centimeter")
    void isMillimeterEqual() {
        Quantity tenMM = new Quantity(new BigDecimal(10), Unit.MM);
        Quantity oneCentimeter = new Quantity(new BigDecimal(1), Unit.CM);
        assertEquals(tenMM, oneCentimeter);
    }

    @Test
    @DisplayName("should return true if the 100 gallons is equal to 378 liters")
    void isHundredGallonsEqualToThreeSevenEightLiters() {
        Quantity hundredGallon = new Quantity(new BigDecimal(100), Unit.GALLON);
        Quantity threeSevenEightLitres = new Quantity(new BigDecimal(378), Unit.LITER);
        assertEquals(hundredGallon, threeSevenEightLitres);
    }

    @Test
    @DisplayName("should return true if the 1 gallon is equal to 3.78 liters")
    void isOneGallonEqualToThreePointSevenEightLitres() {
        Quantity oneGallon = new Quantity(new BigDecimal("1.00"), Unit.GALLON);
        Quantity threePointSevenEightLitres = new Quantity(new BigDecimal("3.78"), Unit.LITER);
        assertEquals(oneGallon, threePointSevenEightLitres);
    }

    @Test
    @DisplayName("should return false if the types are different")
    void differentTypesOfQuantitiesShouldNotBeEqual() {
        Quantity oneMM = new Quantity(new BigDecimal(1), Unit.MM);
        Quantity hundredLitres = new Quantity(new BigDecimal(100), Unit.LITER);
        assertNotEquals(oneMM, hundredLitres);
    }

    @Test
    void shouldReturnTheSumOfTwoInches() {
        Quantity oneInch = new Quantity(new BigDecimal(1), Unit.INCH);
        Quantity twoInch = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity expected = new Quantity(new BigDecimal(3), Unit.INCH);
        assertEquals(expected,oneInch.addAnotherQuantity(twoInch));

    }

    @Test
    void shouldThrowExceptionQuantitiesAreDifferent() {
        Quantity oneInch = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity twoInch = new Quantity(new BigDecimal(2), Unit.INCH);
        assertThrows(InvalidParameterException.class,()->oneInch.addAnotherQuantity(twoInch));

    }
}