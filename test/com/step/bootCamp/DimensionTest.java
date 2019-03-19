package com.step.bootCamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionTest {
    @Test
    void getValueOfDimension() throws Exception {
        Dimension dimension = new Dimension(1);
        assertEquals(dimension.getValue(), 1);
    }

    @Test
    void NegativeDimensionValue() throws Exception {
        try {
            new Dimension(-1);
            fail("Negative dimension should have thrown exception.");
        } catch (NegativeDimensionException e) {
            assertEquals(e.getMessage(),"Negative dimension exception");
        }

    }
}