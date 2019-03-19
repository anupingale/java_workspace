package com.step.bootCamp;

public class Dimension {
    private final double value;

    public Dimension(double value) throws Exception {
        this.validateDimension(value);
        this.value = value;
    }

    private void validateDimension(double value) throws Exception {
        if (value < 0) {
            throw new NegativeDimensionException();
        }
    }

    public double getValue() {
        return this.value;
    }

}
