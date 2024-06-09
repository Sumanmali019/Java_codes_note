package DsaBasic;

import java.util.*;

/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 */

public class IsAnalog {
    public boolean isAnagram(String s, String t) {

        int n = s.length();

        int k = t.length();

        if (n != k) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] charst = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(charst);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != charst[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsAnalog isAnalog = new IsAnalog();
        String s = "fox";
        String t = "fot";
        Boolean isTrue = isAnalog.isAnagram(s, t);
        System.out.println(isTrue);
    }
}
