package com.step.Measurements;

import java.math.BigDecimal;

class Unit {

    private final BigDecimal baseValue;
    private static final Object LENGTH = new Object();
    private static final Object VOLUME = new Object();

    static final Unit FEET = new Unit(new BigDecimal(300), LENGTH);
    static final Unit INCH = new Unit(new BigDecimal(25), LENGTH);
    static final Unit CM = new Unit(new BigDecimal(10), LENGTH);
    static final Unit MM = new Unit(new BigDecimal(1), LENGTH);

    static final Unit GALLON = new Unit(new BigDecimal(378), VOLUME);
    static final Unit LITER = new Unit(new BigDecimal(100), VOLUME);
    private final Object type;

    private Unit(BigDecimal baseValue, Object type) {
        this.baseValue = baseValue;
        this.type = type;
    }

    boolean isSameType(Unit otherUnit) {
        return otherUnit.type == this.type;
    }

    BigDecimal convertToBase(BigDecimal value) {
        return this.baseValue.multiply(value);
    }
}
