package Hashing;

import java.util.*;

/*
You are given an array A of N integers. 
Return the count of elements with frequncy 1 in the given array.
 */

public class CountUniq {

    public int solve(int[] A) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            if (maps.containsKey(A[i])) {
                int frq = maps.get(A[i]);
                maps.put(A[i], frq + 1);
            } else {
                maps.put(A[i], 1);
            }

        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (maps.get(A[i]) == 1) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        CountUniq countUniq = new CountUniq();

        int[] a = { 3, 3, 3, 0, 9, 1, 0 };

        int ans = countUniq.solve(a);

        System.out.println(ans);
    }
}
