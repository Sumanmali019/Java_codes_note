package Hashing;

import java.util.*;

/*
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order. 
 */

public class CommonElement {
    public int[] ans(int[] A, int[] B) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int a : A) {
            ans.put(a, ans.getOrDefault(a, 0) + 1);
        }
        for (int b : B) {
            Integer frq = ans.get(b);

            if (frq != null && frq > 0) {
                arr.add(b);
                ans.put(b, frq - 1);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 1 };
        int[] b = { 2, 3, 1, 2 };

        CommonElement element = new CommonElement();
        int[] ans = element.ans(a, b);

        System.out.println(Arrays.toString(ans));
    }

}
