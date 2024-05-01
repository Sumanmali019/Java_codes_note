package BasicMethod.prefixSum;

/*
 * Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

public class RangeSunQuery {

    public long[] rangeSum(int[] A, int[][] B) {

        int a = A.length;
        int b = B.length;

        long[] prefixsum = new long[a];
        long[] newarr = new long[b];

        prefixsum[0] = A[0];

        for (int i = 1; i < a; i++) {
            prefixsum[i] = prefixsum[i - 1] + A[i];
        }

        for (int i = 0; i < b; i++) {
            int start = B[i][0];
            int end = B[i][1];

            // if ( start == 0){
            // newarr[i] = prefixsum[end];
            // } else {
            // newarr[i] = prefixsum[end] - prefixsum[start-1];
            // }
            newarr[i] = prefixsum[end] - (start > 0 ? prefixsum[start - 1] : 0);
        }
        return newarr;
    }

}
