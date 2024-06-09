package DsaBasic;

import java.util.*;
/*
Given an integer array nums of length n, you want to create an array ans of 
length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */

public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            newarr[i] = nums[i];
            newarr[n + i] = nums[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        Concatenation concatenation = new Concatenation();
        int[] a = { 1, 2, 3 };
        int[] ans = concatenation.getConcatenation(a);
        System.out.println(Arrays.toString(ans));
    }

}
