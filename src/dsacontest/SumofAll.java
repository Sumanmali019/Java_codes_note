package dsacontest;
/*
 Sum of All x Length Subarrays
Problem Description
Given an array of positive integers A of size N, return the sum of all possible subarrays of A of length equal to maximum value of x such that x*x <= N. Note: - a subarray is a contiguous subsequence of the array.
 */

public class SumofAll {

    public long sumAll(int[] A) {

        int n = A.length;
        int x = (int) Math.sqrt(n);

        System.out.println(x);

        long totalsum = 0;
        for (int i = 0; i <= n - x; i++) {
            long currentsum = 0;
            for (int j = i; j < i + x; j++) {
                currentsum += A[j];
            }
            totalsum += currentsum;
        }

        return totalsum;

    }

    public static void main(String[] args) {
        SumofAll sumOfAll = new SumofAll();
        int[] a = { 2, 3, 1, 4, 8 };
        long ans = sumOfAll.sumAll(a);
        System.out.println(ans);
    }

}
