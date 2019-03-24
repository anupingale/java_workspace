package com.step.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {
    @Test
    void shouldAddTwoMetrics() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{2, 4}, {6, 8}};

        Matrix metric = new Matrix(2, 2, numbers);
        Matrix expected = new Matrix(2, 2, expectedMetric);
        assertEquals(expected, metric.add(metric));
    }

    @Test
    void shouldSubtractTwoMetrics() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{0, 0}, {0, 0}};

        Matrix metric = new Matrix(2, 2, numbers);
        Matrix expected = new Matrix(2, 2, expectedMetric);
        assertEquals(expected, metric.subtract(metric));
    }

    @Test
    void shouldMultiplyTwoMetric() {
        int[][] numbers = {{1, 1}, {1, 1}};
        int[][] expectedMetric = {{2, 2}, {2, 2}};

        Matrix metric = new Matrix(2, 2, numbers);
        Matrix expected = new Matrix(2, 2, expectedMetric);
        assertEquals(expected, metric.multiply(metric));
    }


    @Test
    void shouldReturnTranspose() {
        int[][] numbers = {{1, 2}, {3, 4}};
        int[][] expectedMetric = {{1, 3}, {2, 4}};

        Matrix metric = new Matrix(2, 2, numbers);
        Matrix expected = new Matrix(2, 2, expectedMetric);
        assertEquals(expected, metric.transpose());
    }
}