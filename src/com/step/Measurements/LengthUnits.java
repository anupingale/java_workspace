package com.step.Measurements;

import java.math.BigDecimal;

public class LengthUnits extends Unit {

    static final LengthUnits FEET = new LengthUnits(new BigDecimal(1200));
    static final LengthUnits INCH = new LengthUnits(new BigDecimal(100));
    static final LengthUnits CM = new LengthUnits(new BigDecimal(40));
    static final LengthUnits MM = new LengthUnits(new BigDecimal(4));

    private LengthUnits(BigDecimal baseValue) {
        super(baseValue);
    }

    public LengthUnits getStandardUnit() {
        return LengthUnits.INCH;
    }

}
