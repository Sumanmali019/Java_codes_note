package dsacontest;
/*
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form: • If A[i][j] = B then return (i * 1009 + j)
• If B is not present return -1.
 */

public class search {
    public int solve(int[][] A, int B) {
        int N = A.length; // Number of rows
        int M = A[0].length; // Number of columns

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == B) {
                    return (i + 1) * 1009 + (j + 1); // Return the 1-based index position
                } else if (A[i][j] > B) {
                    // Since row and column are sorted in non-decreasing order,
                    // no need to continue in this row
                    break;
                }
            }
        }
        return -1; // B not found

    }
}
