package DSATwoDinmention;
/*
 Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing
 */

public class RowAndColumSorting {

    public int solve(int[][] A, int B) {

        int row = A.length;
        int colum = A[0].length;

        int min = Integer.MAX_VALUE;

        for (int j = 0; j < colum; j++) {
            for (int i = 0; i < row; i++) {
                if (A[i][j] == B) {
                    int ans = (i + 1) * 1009 + j + 1;
                    min = Math.min(ans, min);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

}
