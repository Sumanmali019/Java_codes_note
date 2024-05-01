package DSATwoDinmention;

/*
 Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 */

public class SprialMatrix {

    public int[][] generateMatrix(int A) {

        int[][] newarr = new int[A][A];
        int n = A;
        int row = 0;
        int column = 0;
        int val = 1;

        while (n > 1) {

            for (int i = 1; i < n; i++) {
                newarr[row][column] = val;
                val++;
                column++;
            }

            for (int i = 1; i < n; i++) {
                newarr[row][column] = val;
                val++;
                row++;
            }

            for (int i = 1; i < n; i++) {
                newarr[row][column] = val;
                val++;
                column--;
            }

            for (int i = 1; i < n; i++) {
                newarr[row][column] = val;
                val++;
                row--;
            }
            row++;
            column++;
            n = n - 2;
        }

        if (n == 1) {
            newarr[row][column] = val;
            val++;

        }

        return newarr;

    }

}
