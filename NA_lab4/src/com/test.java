package com;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class test {
    public static void testF() {
        // number of inputs given
        int n = 4;
        float value, sum;
        float y[][]=new float[5][5];
        float x[] = { 0, 1, 2, 3 };

        // y[][] is used for divided difference
        // table where y[][0] is used for input
        y[0][0] = 0;
        y[1][0] = 1;
        y[2][0] = 32;
        y[3][0] = 243;

        // calculating divided difference table
        dividedDiffTable(x, y, n);

        // displaying divided difference table
        printDiffTable(y,n);

    }

    private static void printDiffTable(float[][] y, int n) {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.HALF_UP);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                String str1 = df.format(y[i][j]);
                System.out.print(str1+"\t ");
            }
            System.out.println("");
        }
    }

    private static void dividedDiffTable(float[] x, float[][] y, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                y[j][i] = (y[j][i - 1] - y[j + 1]
                        [i - 1]) / (x[j] - x[i + j]);
            }
        }
    }

}
