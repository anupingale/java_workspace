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

    private boolean hasSameClass(Quantity quantity) {
        return quantity.unit.getClass() == this.unit.getClass();
    }

    private boolean hasSameBaseValue(Quantity quantity) {
        return this.calculateBaseValue().intValue() == quantity.calculateBaseValue().intValue();
    }

    @Override
    public boolean equals(Object otherQuantity) {
        if (this == otherQuantity) return true;
        if (otherQuantity == null || getClass() != otherQuantity.getClass()) return false;
        Quantity quantity = (Quantity) otherQuantity;
        return hasSameClass(quantity) && hasSameBaseValue(quantity);
    }

    Quantity add(Quantity otherQuantity) throws NoSuchMethodException {
        if (!hasSameClass(otherQuantity)) throw new InvalidParameterException();
        BigDecimal sumOfQuantities = this.calculateBaseValue().add(otherQuantity.calculateBaseValue());
        BigDecimal quantitiesSumInInches = this.unit.convertToStandard(sumOfQuantities);
        return new Quantity(quantitiesSumInInches, this.unit.getStandardUnit());
    }
}
