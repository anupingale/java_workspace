package com.step.Measurements;

import java.math.BigDecimal;

class Unit {
    private final BigDecimal baseValue;

    private Unit(BigDecimal baseValue) {
        this.baseValue = baseValue;
    }

    static final Unit FEET = new Unit(new BigDecimal(300));
    static final Unit INCH = new Unit(new BigDecimal(25));
    static final Unit CM = new Unit(new BigDecimal(10));
    static final Unit MM = new Unit(new BigDecimal(1));


    BigDecimal convertToBase(BigDecimal value) {
        return this.baseValue.multiply(value);
    }
}
