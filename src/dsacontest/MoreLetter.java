package dsacontest;

import java.util.*;

/*
 Problem Description
Given a string A of length N consisting of lowercase letters, and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to find the count of consonants and count of vowels in the substring A[B[i][0] ... B[i] [1]], 
Return an array of strings of length Q, where ith string is "Vowel" if the count of vowels is greater than or equal to the count of consonants, 
else it is "Consonant".
 */

public class MoreLetter {

    public String[] solve(String A, int[][] B) {
        int row = B.length;
        int n = A.length();
        String[] result = new String[row];

        // prefix_sum
        int[] vowelPrefix = new int[n];
        int[] consprefix = new int[n];

        if (isVowel(A.charAt(0))) {
            vowelPrefix[0] = 1;
        } else {
            consprefix[0] = 1;
        }

        for (int i = 1; i < n; i++) {
            vowelPrefix[i] = vowelPrefix[i - 1];
            consprefix[i] = consprefix[i - 1];

            if (isVowel(A.charAt(i))) {
                vowelPrefix[i]++;
            } else {
                consprefix[i]++;
            }
        }

        for (int i = 0; i < row; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int vowelCount = vowelPrefix[end] - (start > 0 ? vowelPrefix[start - 1] : 0);
            int consonantCount = consprefix[end] - (start > 0 ? consprefix[start - 1] : 0);

            if (vowelCount >= consonantCount) {
                result[i] = "Vowel";
            } else {
                result[i] = "Consonant";
            }
        }
        return result;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        MoreLetter n = new MoreLetter();

        String a = "example";
        int[][] b = { { 0, 3 }, { 2, 5 }, { 1, 3 } };

        String[] newarr = n.solve(a, b);

        System.out.println(Arrays.toString(newarr));
    }

}
