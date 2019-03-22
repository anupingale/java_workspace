package com.step.Measurements;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class TemperatureUnits extends Unit{

    private BigDecimal baseValue;
    private BigDecimal scale;
    static final TemperatureUnits CELSIUS = new TemperatureUnits(new BigDecimal(1.8),new BigDecimal(32));
    static final TemperatureUnits FAHRENHEIT = new TemperatureUnits(new BigDecimal(1),new BigDecimal(0));

    private TemperatureUnits(BigDecimal baseValue,BigDecimal scale) {
        super(baseValue);
        this.baseValue = baseValue;
        this.scale = scale;
    }

    public TemperatureUnits getStandardUnit() {
        return TemperatureUnits.CELSIUS;
    }

    BigDecimal convertToBase(BigDecimal value) {
        return this.baseValue.multiply(value).add(this.scale);
    }

    BigDecimal convertToStandard(BigDecimal value) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

}
