package CarryForwordAndSubarray;

/*
 You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
 */

public class GenerateAllSubarray {

    public int[][] solve(int[] A) {

        int a = A.length;

        int[][] newarr = new int[a * (a + 1) / 2][];

        int count = 0;

        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                newarr[count] = new int[j - i + 1];
                int size = 0;
                for (int k = i; k <= j; k++) {
                    newarr[count][size] = A[k];
                    size++;
                }
                count++;
            }
        }
        return newarr;

    }

}
