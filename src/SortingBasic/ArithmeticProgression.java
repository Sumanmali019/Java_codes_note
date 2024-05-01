package SortingBasic;
import java.util.*;

/*
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */

public class ArithmeticProgression {
    public int solve(int[] A) {

        Arrays.sort(A);

        int a = A.length;
        int ans = 1;

        int diff = A[1] - A[0];

        for (int i = 1; i < a; i++) {
            if (A[i] - A[i - 1] != diff) {
                ans = 0;
                break;
            }
        }
        return ans;
    }

}
