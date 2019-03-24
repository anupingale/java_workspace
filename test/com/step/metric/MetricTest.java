package com.step.metric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetricTest {
    @Test
    void shouldAddTwoMetrics() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{2, 4}, {6, 8}};

        Metric metric = new Metric(2, 2, numbers);
        Metric expected = new Metric(2, 2, expectedMetric);
        assertEquals(expected, metric.add(metric));
    }

    @Test
    void shouldSubtractTwoMetrics() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{0, 0}, {0, 0}};

        Metric metric = new Metric(2, 2, numbers);
        Metric expected = new Metric(2, 2, expectedMetric);
        assertEquals(expected, metric.subtract(metric));
    }

    @Test
    void shouldMultiplyTwoMetric() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{0, 0}, {0, 0}};

        Metric metric = new Metric(2, 2, numbers);
        Metric expected = new Metric(2, 2, expectedMetric);
        assertEquals(expected, metric.multiply(metric));
    }
}