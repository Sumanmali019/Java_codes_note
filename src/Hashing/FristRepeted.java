package Hashing;

import java.util.*;

/*
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.
 */
public class FristRepeted {

    public int solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int feq = map.get(A[i]);
                map.put(A[i], feq + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) > 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 3, 4, 3, 5, 6 };
        FristRepeted fristRepeted = new FristRepeted();
        int ans = fristRepeted.solve(a);
        System.out.println(ans);

    }
}
