package Hashing;

import java.util.*;

/*
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, 
return the remainder on dividing the result with 109+7
 */
public class CountSub {
    public int solve(int[] A) {
        int[] prefixSum = new int[A.length];
        int count = 0;
        int mod = 1000000007;

        prefixSum[0] = A[0];

        if (prefixSum[0] == 0)
            count++;

        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
            if (prefixSum[i] == 0)
                count++;
        }
        // Create a HashMap for Prefixsum
        HashMap<Integer, Integer> hsPrefixsum = new HashMap<>();
        for (int j = 0; j < prefixSum.length; j++) {
            if (hsPrefixsum.containsKey(prefixSum[j])) {
                count += hsPrefixsum.get(prefixSum[j]);// to consider all pairrs that form sunarray
                count %= mod;
                hsPrefixsum.put(prefixSum[j], hsPrefixsum.get(prefixSum[j]) + 1);
            } else
                hsPrefixsum.put(prefixSum[j], 1);
        }
        return count;
    }
}
