package BasicMethod.prefixSum;
/*
 * Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 * 
 * 
 */

public class EvenSum {
    public int[] solve(int[] A, int[][] B) {

        int a = A.length;
        int b = B.length;

        int[] prefixsum = new int[a];
        int[] newarr = new int[b];

        prefixsum[0] = ((A[0] % 2 == 0) ? 1 : 0);

        for (int i = 1; i < a; i++) {
            prefixsum[i] = prefixsum[i - 1] + ((A[i] % 2 == 0) ? 1 : 0);
        }

        for (int i = 0; i < b; i++) {
            int left = B[i][0];
            int right = B[i][1];

            if (left == 0) {
                newarr[i] = prefixsum[right];
            } else {
                newarr[i] = prefixsum[right] - prefixsum[left - 1];
            }
        }
        return newarr;
    }

}
