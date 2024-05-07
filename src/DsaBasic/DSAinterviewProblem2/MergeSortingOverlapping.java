package DsaBasic.DSAinterviewProblem2;

import java.util.*;
/*
 You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
 */

public class MergeSortingOverlapping {

    public int[][] solve(int[][] A) {

        //frist approch

        // Arrays.sort(A, (a, b) -> a[0] - b[0]);

        // ArrayList<int[]> res = new ArrayList<>();
        // int[] index = A[0];

        // res.add(index);

        // for (int[] interval : A) {

        // int end = index[1];

        // int next_start = interval[0];
        // int next_end = interval[1];

        // if (end >= next_start) {
        // index[1] = Math.max(end, next_end);
        // } else {
        // index = interval;
        // res.add(index);
        // }
        // }
        // return res.toArray(new int[res.size()][]);
        // }

        // second approch

        List<int[]> result = new ArrayList<>();

        int n = A.length;
        int[] current;
        int i = 0;

        while (i < n) {
            current = A[i];
            i++;

            int next[];

            while (i < n) {
                next = A[i];

                if (isOverLapping(current, next)) {
                    current[1] = Math.max(current[1], next[1]);
                    i++;
                } else {
                    break;
                }
            }
            result.add(current);
        }
        return result.toArray(new int[result.size()][]);

    }

    boolean isOverLapping(int[] a1, int[] a2) {
        if (a1[1] >= a2[0]) {
            return true;
        }
        return false;
    }
}
