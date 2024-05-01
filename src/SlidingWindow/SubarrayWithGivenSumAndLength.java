package SlidingWindow;
/*
 Problem Description
Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 */

public class SubarrayWithGivenSumAndLength {
    public int solve(int[] A, int B, int C) {

        int a = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        if (sum == C) {
            return 1;
        }

        int left = 1;
        int right = B;

        while (right < a) {
            sum += A[right] - A[left - 1];

            if (sum == C) {
                return 1;
            }
            left++;
            right++;
        }
        return 0;
    }

}
