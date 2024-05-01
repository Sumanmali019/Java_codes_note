package DSATwoDinmention;
/*
 Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
 */

public class MinSwap {

    public int solve(int[] A, int B) {

        int n = A.length;
        int max_swap = -1;
        int numless = 0;
        int nummore = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                numless++;
            }
        }
        for (int i = 0; i < numless; i++) {
            if (A[i] > B) {
                nummore++;
            }
        }
        max_swap = nummore;
        int swip = max_swap;

        int s = 0;
        int e = numless;

        while (e < n) {
            if (A[s] > B) {
                swip--;
            }
            if (A[e] > B) {
                swip++;
            }
            if (swip < max_swap) {
                max_swap = swip;
            }
            s++;
            e++;
        }
        return max_swap;
    }

}
