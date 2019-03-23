package com.step.Measurements;

import java.math.BigDecimal;

abstract class Unit {

    private final BigDecimal baseValue;

    Unit(BigDecimal baseValue) {
        this.baseValue = baseValue;
    }

    BigDecimal convertToBase(BigDecimal value) {
        return this.baseValue.multiply(value);
    }

    BigDecimal convertToStandard(BigDecimal value) throws NoSuchMethodException {
        return value.divide(new BigDecimal(100));
    }

    Unit getStandardUnit() {
        return null;
    }
}
