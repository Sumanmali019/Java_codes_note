package DsaBasic.DSATwoDinmention;
/*
 Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).
 */

public class RowIthMaxOne {

    public int solve(int[][] A) {

        int row = 0;
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    row = i;
                }
            }
        }
        return row;
    }

}
