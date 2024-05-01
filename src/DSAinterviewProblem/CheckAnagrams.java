package DSAinterviewProblem;

import java.util.*;

/*
 You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 */

public class CheckAnagrams {

    public int solve(String A, String B) {

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        String x = new String(a);
        String y = new String(b);

        if (x.equals(y)) {
            return 1;
        }
        return 0;
    }

}
