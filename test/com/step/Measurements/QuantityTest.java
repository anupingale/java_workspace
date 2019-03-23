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
        Quantity feet = new Quantity(new BigDecimal(1), LengthUnits.FEET);
        Quantity feet1 = new Quantity(new BigDecimal(1), LengthUnits.FEET);
        assertEquals(feet, feet1);
    }

    @Test
    @DisplayName("should return false if the two same type of quantities are not equal")
    void isFeetEquals1() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), LengthUnits.FEET);
        Quantity twoFeet = new Quantity(new BigDecimal(2), LengthUnits.FEET);
        assertNotEquals(oneFeet, twoFeet);
    }

    @Test
    @DisplayName("should return true if two different type of quantities are equal")
    void isInchesEquals() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), LengthUnits.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(12), LengthUnits.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    @DisplayName("should return false if two different type of quantities are not equal")
    void isInchesEquals1() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), LengthUnits.FEET);
        Quantity oneInch = new Quantity(new BigDecimal(1), LengthUnits.INCH);
        assertNotEquals(oneFeet, oneInch);
    }

    @Test
    @DisplayName("should return true if inches are equal to centimeter")
    void isCentimeterEqual() {
        Quantity twoInch = new Quantity(new BigDecimal(2), LengthUnits.INCH);
        Quantity fiveCentimeter = new Quantity(new BigDecimal(5), LengthUnits.CM);
        assertEquals(twoInch, fiveCentimeter);
    }

    @Test
    @DisplayName("should return true if millimeters are equal to centimeter")
    void isMillimeterEqual() {
        Quantity tenMM = new Quantity(new BigDecimal(10), LengthUnits.MM);
        Quantity oneCentimeter = new Quantity(new BigDecimal(1), LengthUnits.CM);
        assertEquals(tenMM, oneCentimeter);
    }

    @Test
    @DisplayName("should return true if the 100 gallons is equal to 378 liters")
    void isHundredGallonsEqualToThreeSevenEightLiters() {
        Quantity hundredGallon = new Quantity(new BigDecimal(100), VolumeUnits.GALLON);
        Quantity threeSevenEightLitres = new Quantity(new BigDecimal(378), VolumeUnits.LITER);
        assertEquals(hundredGallon, threeSevenEightLitres);
    }

    @Test
    @DisplayName("should return true if the 1 gallon is equal to 3.78 liters")
    void isOneGallonEqualToThreePointSevenEightLitres() {
        Quantity oneGallon = new Quantity(new BigDecimal("1.00"), VolumeUnits.GALLON);
        Quantity threePointSevenEightLitres = new Quantity(new BigDecimal("3.78"), VolumeUnits.LITER);
        assertEquals(oneGallon, threePointSevenEightLitres);
    }

    @Test
    @DisplayName("should return false if the types are different")
    void differentTypesOfQuantitiesShouldNotBeEqual() {
        Quantity oneMM = new Quantity(new BigDecimal(1), LengthUnits.MM);
        Quantity hundredLitres = new Quantity(new BigDecimal(100), VolumeUnits.LITER);
        assertNotEquals(oneMM, hundredLitres);
    }

    @Test
    @DisplayName("should return new 3 inches if 1 inch and 2 inches are added")
    void shouldReturnTheSumOfTwoInches() throws NoSuchMethodException {
        Quantity oneInch = new Quantity(new BigDecimal(1), LengthUnits.INCH);
        Quantity twoInch = new Quantity(new BigDecimal(2), LengthUnits.INCH);
        Quantity expected = new Quantity(new BigDecimal(3.00), LengthUnits.INCH);
        System.out.println(oneInch.add(twoInch));
        assertEquals(expected, oneInch.add(twoInch));
    }

    @Test
    @DisplayName("should throw exception if quantities are of different type")
    void shouldThrowExceptionIfQuantitiesAreDifferent() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), VolumeUnits.GALLON);
        Quantity twoInch = new Quantity(new BigDecimal(2), LengthUnits.INCH);
        assertThrows(InvalidParameterException.class, () -> oneGallon.add(twoInch));
    }

    @Test
    @DisplayName("should add two inch quantities and return new inch quantity")
    void shouldAddTwoInches() throws NoSuchMethodException {
        Quantity twoInch = new Quantity(new BigDecimal("2.0"), LengthUnits.INCH);
        Quantity twoPointFiveFiveCM = new Quantity(new BigDecimal("2.5"), LengthUnits.CM);
        Quantity expected = new Quantity(new BigDecimal("3.0"), LengthUnits.INCH);
        assertEquals(expected, twoInch.add(twoPointFiveFiveCM));
    }

    @Test
    @DisplayName("should return true if the two volume quantities are equal")
    void shouldAddGallonAndLiter() throws NoSuchMethodException {
        Quantity oneGallon = new Quantity(new BigDecimal(1), VolumeUnits.GALLON);
        Quantity oneLiter = new Quantity(new BigDecimal(1), VolumeUnits.LITER);
        Quantity expected = new Quantity(new BigDecimal("4.78"), VolumeUnits.GALLON);
        assertEquals(expected, oneLiter.add(oneGallon));
    }

    @Test
    @DisplayName("should return true when compare temperature units are equal")
    void shouldCompareTemperatureInCelsiusToFahrenheit() {
        Quantity fahrenheit = new Quantity(new BigDecimal(212), TemperatureUnits.FAHRENHEIT);
        Quantity celsius = new Quantity(new BigDecimal(100), TemperatureUnits.CELSIUS);
        assertEquals(fahrenheit, celsius);
    }

    @Test
    void shouldNotAddTwoTemperatures() {
        Quantity fahrenheit = new Quantity(new BigDecimal(212), TemperatureUnits.CELSIUS);
        Quantity celsius = new Quantity(new BigDecimal(100), TemperatureUnits.CELSIUS);
        assertThrows(NoSuchMethodException.class, () -> fahrenheit.add(celsius));
    }
}