package BasicMethod.CarryForwordAndSubarray;
/*
 Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.
 */

public class Leaders {

    public int[] solve(int[] A) {

        int a = A.length;
        int max = Integer.MIN_VALUE;
        int leader = 0;

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (max < A[j]) {
                    max = A[j];
                }
            }
            if (max < A[i]) {
                leader++;
            }
            max = Integer.MIN_VALUE;
        }

        int[] maxarray = new int[leader];
        int k = 0;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (max < A[j]) {
                    max = A[j];
                }
            }

            if (max < A[i]) {
                maxarray[k] = A[i];
                k++;
            }
            max = Integer.MIN_VALUE;
        }
        return maxarray;
    }

}
