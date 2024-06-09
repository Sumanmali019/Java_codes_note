package DsaBasic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Given an array of strings strs,group all anagrams together into sublists.You may return the output in any order.

An anagram is a string that contains the exact same characters as another string,but the order of the characters can be different.

Example 1:

Input:strs=["act","pots","tops","cat","stop","hat"]

Output:[["hat"],["act","cat"],["stop","pots","tops"]]*

*/

public class Anagram {
    public List<List<String>> groupAnagrams(String[] s) {

        Map<String, List<String>> ans = new HashMap<>();

        for (String su : s) {
            int[] count = new int[26];
            for (char c : su.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(su);
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        String[] ans = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> aa = anagram.groupAnagrams(ans);

        System.out.println(aa);
    }
}
