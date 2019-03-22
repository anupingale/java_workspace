package com.step.Quantities;

import java.math.BigDecimal;

enum LengthUnits {
    FEET(new BigDecimal(10)),
    INCH(new BigDecimal(25));

    final BigDecimal value;

    LengthUnits(BigDecimal value) {
        this.value = value;
    }

//    public BigDecimal getBaseValue() {
//        return
//    }
}
