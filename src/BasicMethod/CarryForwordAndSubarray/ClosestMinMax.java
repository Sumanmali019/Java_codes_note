package BasicMethod.CarryForwordAndSubarray;
/*
 Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.
 */

public class ClosestMinMax {

    public int solve(int[] A) {

        int a = A.length;

        int max_value = A[0];
        int min_value = A[0];

        int max_index = 0;
        int min_index = 0;

        int sum = a;

        for (int i = 0; i < a; i++) {

            if (A[i] > max_value) {
                sum = a;
                max_value = A[i];
                max_index = i;
            }

            if (A[i] < min_value) {
                sum = a;
                min_value = A[i];
                min_index = i;
            }

            max_index = (A[i] == max_value) ? i : max_index;
            min_index = (A[i] == min_value) ? i : min_index;

            sum = Math.min(sum, Math.abs(max_index - min_index) + 1);
        }
        return sum;
    }
}
