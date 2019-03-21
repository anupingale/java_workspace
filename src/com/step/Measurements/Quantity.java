package com.step.Measurements;

import java.math.BigDecimal;

class Quantity {
    private Unit unit;
    private BigDecimal value;

    Quantity(BigDecimal value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    private BigDecimal calculateBaseValue() {
        return this.unit.convertToBase(this.value);
    }

    @Override
    public boolean equals(Object otherQuantity) {
        if (this == otherQuantity) return true;
        if (otherQuantity == null || getClass() != otherQuantity.getClass()) return false;
        Quantity quantity = (Quantity) otherQuantity;
        return this.calculateBaseValue().equals(quantity.calculateBaseValue());
    }
}
