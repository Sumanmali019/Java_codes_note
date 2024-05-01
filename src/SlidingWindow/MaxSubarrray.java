package SlidingWindow;
/*
 Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
 */

public class MaxSubarrray {
    public int maxSubarray(int A, int B, int[] C) {

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (ans < sum && sum <= B) {
                    ans = sum;
                }
            }
        }
        return (ans == Integer.MIN_VALUE) ? 0 : ans;
    }

}
