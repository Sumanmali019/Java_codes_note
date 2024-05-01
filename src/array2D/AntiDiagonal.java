package array2D;
/*
 Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 */

public class AntiDiagonal {
    public int[][] diagonal(int[][] A) {

        int n = A.length;
        int[][] arr = new int[2 * n - 1][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = A[j][Math.abs(i - j)];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                arr[n + i][j] = A[i + j + 1][n - 1 - j];
            }
        }
        return arr;
    }

}
