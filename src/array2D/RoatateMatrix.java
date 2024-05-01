package array2D;

/*
 You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.


 */

public class RoatateMatrix {
    public void solve(int[][] A) {

        int a = A.length;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                int transpose = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = transpose;
            }
        }

        for (int i = 0; i < a; i++) {
            int left = 0;
            int right = a - 1;

            while (left < right) {
                int ratate = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = ratate;

                left++;
                right--;
            }
        }
    }

}
