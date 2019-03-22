package com.step.Quantities;

import java.math.BigDecimal;

public class Length {
    private BigDecimal value;

    private LengthUnits units;

    public Length(BigDecimal value, LengthUnits units) {
        this.value = value;
        this.units = units;
    }

    public Length(BigDecimal value) {
        this.value = value;
    }

//    @Override
//    public boolean equals(Object otherQuantity) {
//        if (this == otherQuantity) return true;
//        if (otherQuantity == null || getClass() != otherQuantity.getClass()) return false;
//        Length length = (Length) otherQuantity;
//        return length.getBaseValue().equals(this.getBaseValue());
//    }

//    private BigDecimal getBaseValue() {
//        return units
//    }
}
