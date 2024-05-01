package DSAinterviewProblem2;

/*
 Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.
 */

public class FrsitMissingInteger {

    public int firstMissingPositive(int[] A) {

        int n = A.length;
        boolean[] seen = new boolean[n + 1];

        for (int num : A) {
            if (num > 0 && num <= n) {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return n + 1;
    }

}
