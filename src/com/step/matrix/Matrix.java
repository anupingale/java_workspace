package com.step.matrix;

import java.security.InvalidParameterException;

class Matrix {
    private final int row;
    private final int column;
    private final int[][] matrix;

    Matrix(int row, int column, int[][] matrix) {
        this.row = row;
        this.column = column;
        this.matrix = matrix;
    }

    Matrix add(Matrix otherMatrix) {
        if (hasDifferentLength(otherMatrix)) throw new InvalidParameterException();

        int[][] result = new int[this.row][this.column];
        for (int i = 0; i < row; i++)
            for (int i1 = 0; i1 < column; i1++)
                result[i][i1] = matrix[i][i1] + otherMatrix.matrix[i][i1];
        return new Matrix(row, column, result);
    }

    private boolean hasDifferentLength(Matrix otherMatrix) {
        return otherMatrix.column != this.column || otherMatrix.row != this.row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix metric1 = (Matrix) o;
        return this.isEqual(metric1);
    }

    private boolean isEqual(Matrix otherMatrix) {
        if (hasDifferentLength(otherMatrix)) return false;
        for (int i = 0; i < row; i++)
            for (int i1 = 0; i1 < column; i1++)
                if (!(matrix[i][i1] == otherMatrix.matrix[i][i1])) return false;
        return true;
    }

    Matrix multiply(Matrix otherMatrix) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                result[i][j] = 0;
                for (int k = 0; k < column; k++) result[i][j] += matrix[i][k] * otherMatrix.matrix[k][j];
            }
        return new Matrix(row, column, result);
    }

    Matrix subtract(Matrix otherMatrix) {
        if (hasDifferentLength(otherMatrix)) throw new InvalidParameterException();

        int[][] result = new int[this.row][this.column];
        for (int i = 0; i < row; i++)
            for (int i1 = 0; i1 < column; i1++)
                result[i][i1] = matrix[i][i1] - otherMatrix.matrix[i][i1];
        return new Matrix(row, column, result);
    }

    Matrix transpose() {
        int[][] transpose = new int[this.row][this.column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                transpose[j][i] = matrix[i][j];
        return new Matrix(row, column, transpose);
    }
}