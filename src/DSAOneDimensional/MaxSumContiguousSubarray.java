package DSAOneDimensional;

/*
 * Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
 */

public class MaxSumContiguousSubarray {

    public int maxsubArray(final int[] A) {
        int a = A.length;

        int max_sum = A[0];
        int max_count = A[0];

        for (int i = 1; i < a; i++) {
            max_count = Math.max(A[i], max_count + A[i]);
            max_sum = Math.max(max_sum, max_count);
        }
        return max_sum;

    }

    public static void main(String[] args) {
        MaxSumContiguousSubarray subarray = new MaxSumContiguousSubarray();
        int[] A = { 1, 2, 3, 4, -10 };
        int res = subarray.maxsubArray(A);
        System.out.println(res);
    }

}
