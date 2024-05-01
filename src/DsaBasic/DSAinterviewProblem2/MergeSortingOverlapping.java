package DsaBasic.DSAinterviewProblem2;

import java.util.*;
/*
 You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
 */

public class MergeSortingOverlapping {

    public int[][] solve(int[][] A) {

        Arrays.sort(A, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> res = new ArrayList<>();
        int[] index = A[0];

        res.add(index);

        for (int[] interval : A) {

            int end = index[1];

            int next_start = interval[0];
            int next_end = interval[1];

            if (end >= next_start) {
                index[1] = Math.max(end, next_end);
            } else {
                index = interval;
                res.add(index);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
