package com.step.Measurements;

import java.math.BigDecimal;

public class VolumeUnits extends Unit{

    static final VolumeUnits GALLON = new VolumeUnits(new BigDecimal(378));
    static final VolumeUnits LITER = new VolumeUnits(new BigDecimal(100));

    private VolumeUnits(BigDecimal baseValue) {
        super(baseValue);
    }

    public VolumeUnits getStandardUnit() {
        return VolumeUnits.GALLON;
    }
}
