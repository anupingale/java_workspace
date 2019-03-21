package com.step.Measurements;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

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
        if (this.unit.isSameType(quantity.unit)) {
            return this.calculateBaseValue().equals(quantity.calculateBaseValue());
        }
        return false;
    }

    Quantity addAnotherQuantity(Quantity otherQuantity) {
        if (!this.unit.isSameType(otherQuantity.unit)) {
            throw new InvalidParameterException("invalid parameters");
        }
        BigDecimal sumOfQuantities = this.value.add(otherQuantity.value);
        return new Quantity(sumOfQuantities, this.unit);
    }
}
