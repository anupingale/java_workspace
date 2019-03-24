package com.step.metric;

import java.security.InvalidParameterException;

public class Metric {
    private final int row;
    private final int column;
    private final int[][] metric;

    public Metric(int row, int column, int[][] metric) {
        this.row = row;
        this.column = column;
        this.metric = metric;
    }

    public Metric add(Metric otherMetric) {
        if (hasDifferentLength(otherMetric)) throw new InvalidParameterException();

        int[][] result = new int[this.row][this.column];
        for (int i = 0; i < row; i++)
            for (int i1 = 0; i1 < column; i1++)
                result[i][i1] = metric[i][i1] + otherMetric.metric[i][i1];
        return new Metric(row, column, result);
    }

    private boolean hasDifferentLength(Metric otherMetric) {
        return otherMetric.column != this.column || otherMetric.row != this.row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metric metric1 = (Metric) o;
        return this.isEqual(metric1);
    }

    private boolean isEqual(Metric otherMetric) {
        if (hasDifferentLength(otherMetric)) return false;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < column; i1++) {
                if (!(metric[i][i1] == otherMetric.metric[i][i1])) {
                    return false;
                }
            }

        }
        return true;
    }

    public Metric subtract(Metric otherMetric) {
        if (hasDifferentLength(otherMetric)) throw new InvalidParameterException();

        int[][] result = new int[this.row][this.column];
        for (int i = 0; i < row; i++)
            for (int i1 = 0; i1 < column; i1++)
                result[i][i1] = metric[i][i1] - otherMetric.metric[i][i1];
        return new Metric(row, column, result);
    }

    public Metric multiply(Metric otherMetric) {
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += metric[i][k] * otherMetric.metric[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
        }
}
