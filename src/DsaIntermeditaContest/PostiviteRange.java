package DsaIntermeditaContest;

import java.util.Arrays;

/*
 * 
 * Problem Description
 *You are working on a project to analyze profit for a given set of days. You have been given an array A with profit for N days. You also have Q queries represented by a 2D array B of size Qx2. Each query consists of two integers B[i][0] and B[i][1].
 *For every query, your task is to find the count of non-negative profit in the range from A[B[i][0]] to A[B[i][1]].
 * 
 * 
 * 
 */
public class PostiviteRange {

    public int[] solve1(int A[], int[][] B) {

        int a = A.length;
        int b = B.length;

        int[] prefixsum = new int[a];
        int[] newarr = new int[b];

        prefixsum[0] = (A[0] >= 0) ? 1 : 0;

        for (int i = 1; i < a; i++) {
            prefixsum[i] = prefixsum[i - 1] + (A[i] >= 0 ? 1 : 0);
        }

        for (int i = 0; i < b; i++) {
            int start = B[i][0];
            int end = B[i][1];

            if (start == 0) {
                newarr[i] = prefixsum[end];
            } else {
                newarr[i] = prefixsum[end] - prefixsum[start - 1];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {

        PostiviteRange postiviteRange = new PostiviteRange();
        int[] A = { 1, -1, 0 };
        int[][] B = { { 0, 2 }, { 1, 2 } };

        int[] res = postiviteRange.solve1(A, B);
        System.out.println(Arrays.toString(res));
    }

}
