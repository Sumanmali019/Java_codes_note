package Hashing;

import java.util.*;
/*
Given an array A of N integers, return the number of unique elements in the array. 
 */

public class CountDistinctElement {

    public int solve(int[] A) {
        HashMap<Integer, Integer> hasNumber = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            hasNumber.put(A[i], 1);
        }
        return hasNumber.size();
    }

    public static void main(String[] args) {
        CountDistinctElement countDistinctElement = new CountDistinctElement();

        int[] A = { 3, 2, 3, 2, 1, 0 };

        int ans = countDistinctElement.solve(A);

        System.out.println(ans);

    }

}
