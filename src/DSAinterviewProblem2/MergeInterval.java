package DSAinterviewProblem2;

import java.util.ArrayList;;

/*
 You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.
 */
public class MergeInterval {

    public int[][] insert(int[][] A, int[] B) {

        int n = A.length;

        ArrayList<int[]> res = new ArrayList<>();

        int i = 0;

        // add
        while (i < n && A[i][1] < B[0]) {
            res.add(A[i]);
            i++;
        }

        // mearge
        while (i < n && A[i][0] <= B[1]) {
            B[0] = Math.min(A[i][0], B[0]);
            B[1] = Math.max(A[i][1], B[1]);
            i++;
        }

        res.add(B);

        while (i < n) {
            res.add(A[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
