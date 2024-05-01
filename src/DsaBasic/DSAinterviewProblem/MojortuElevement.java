package DsaBasic.DSAinterviewProblem;

/*
 Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.
 */

public class MojortuElevement {
    public int majorityElement(final int[] A) {

        int n = A.length;
        int max_index = 0;
        int max_count = 1;

        for (int i = 1; i < n; i++) {
            if (max_count == 0) {
                max_index = i;
                max_count = 1;
            } else {
                if (A[i] == A[max_index]) {
                    max_count++;
                } else {
                    max_count--;
                }
            }
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == A[max_index]) {
                count++;
            }
        }
        if (count > n / 2) {
            return A[max_index];
        }
        return -1;
    }

}
