package com.step.matrixArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {
    @Test
    void shouldAddTwoMatrix() {
        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 0, 5));
        ArrayList<Integer> row2 = new ArrayList<>(asList(2, 1, 6));

        Matrix matrix1 = new Matrix(new ArrayList<>(asList(row1, row2)));

        ArrayList<Integer> row3 = new ArrayList<>(asList(2, 0, 10));
        ArrayList<Integer> row4 = new ArrayList<>(asList(4, 2, 12));
        Matrix expected = new Matrix(new ArrayList<>(asList(row3, row4)));
        assertEquals(expected, matrix1.add(matrix1));
    }
}