package Hashing;

import java.util.*;
/*
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
 */

public class Frequencyofelement {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> hasnumber = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            hasnumber.put(A[i], hasnumber.getOrDefault(A[i], 0) + 1);
        }
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            ans[i] = hasnumber.getOrDefault(B[i], 0);
        }
        return ans;
    }

    public static void main(String[] args) {

        Frequencyofelement element = new Frequencyofelement();

        int[] A = { 1, 2, 1, 1, 1 };
        int[] B = { 1, 2 };

        int[] ans = element.solve(A, B);

        System.out.println(Arrays.toString(ans));
    }

}
