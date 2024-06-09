package Hashing;

import java.util.*;;

/*
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.

 */
public class SubArraySum {
    public int solve(int[] A) {

        Long sum = 0l;
        HashSet<Long> newset = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            sum += (long) A[i];

            if (sum == 0) {
                return 1;
            } else if (newset.contains(sum)) {
                return 1;
            } else {
                newset.add(sum);
            }

        }
        return 0;
    }

}
