package BasicMethod.SortingBasic;

import java.util.*;
/*
 Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 */

public class NobleInteger {

    public int solve(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1])
                continue;

            if (A[i] == A.length - i - 1) {
                return 1;
            }

        }
        if (A[A.length - 1] == 0)
            return 1;
        return -1;

    }

}
