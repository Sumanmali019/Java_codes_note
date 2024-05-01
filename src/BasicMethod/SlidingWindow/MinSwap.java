package BasicMethod.SlidingWindow;

/*
 Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
 */
public class MinSwap {
    public int solve(int[] A, int B) {

        int a = A.length;
        int count = 0;
        int bad_index = 0;

        for (int i = 0; i < a; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        if (count == B) {
            return 0;
        }

        for (int i = 0; i < count; i++) {
            if (A[i] > B) {
                bad_index++;
            }
        }

        int minswap = bad_index;

        int i = 0;
        int j = count;

        while (j < a) {
            if (A[i] > B) {
                bad_index--;
            }

            if (A[j] > B) {
                bad_index++;
            }

            minswap = Math.min(minswap, bad_index);
            i++;
            j++;
        }
        return minswap;
    }

}
