package CarryForwordAndSubarray;
/*
 You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.
 */

public class PickFromBiothSide {
    public int solve(int[] A, int B) {

        int n = A.length;

        int[] suffix = new int[n + 1];
        suffix[n] = 0;
        suffix[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = A[i] + suffix[i + 1];
        }

        int prefix = 0;
        int ans = suffix[n - B];

        for (int i = 0; i < B; i++) {
            prefix = prefix + A[i];
            int suffix_sum = suffix[n - B + (i + 1)];
            ans = Math.max(ans, prefix + suffix_sum);
        }
        return ans;
    }

}
