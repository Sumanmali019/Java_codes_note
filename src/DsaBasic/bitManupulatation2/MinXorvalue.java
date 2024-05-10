package DsaBasic.bitManupulatation2;

import java.util.Arrays;
/*
Problem Description
Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
 */

public class MinXorvalue {
    public int findMinXor(int[] A) {
        int N = A.length;

        Arrays.sort(A);

        int ans = Integer.MAX_VALUE;
        int temp = 0;

        for (int i = 0; i < N - 1; i++) {
            temp = A[i] ^ A[i + 1];
            ans = Math.min(ans, temp);
        }

        return ans;

    }
}
