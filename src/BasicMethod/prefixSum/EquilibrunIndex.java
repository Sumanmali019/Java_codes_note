package BasicMethod.prefixSum;

/*
Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 
 */
public class EquilibrunIndex {

    public int solve(int[] A) {

        int left = 0;
        int right = 0;

        int a = A.length;

        int[] prefixsum = new int[a];

        prefixsum[0] = A[0];
        for (int i = 1; i < a; i++) {
            prefixsum[i] = prefixsum[i - 1] + A[i];
        }

        for (int i = 0; i < a; i++) {
            if (i > 0) {
                left = prefixsum[i - 1];
            }
            right = prefixsum[a - 1] - prefixsum[i];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }

}
