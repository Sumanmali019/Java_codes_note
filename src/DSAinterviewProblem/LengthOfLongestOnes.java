package DSAinterviewProblem;

/*
 Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
 */

public class LengthOfLongestOnes {

    public int solve(String A) {

        int total = 0;
        int swap = 0;
        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                total++;
            }
        }
        if (total == n) {
            return n;
        }

        for (int i = 0; i < n; i++) {
            char zero = A.charAt(i);

            if (zero == '0') {
                int left = 0;
                int right = 0;
                int j = i - 1;

                while (j >= 0 && A.charAt(j) == '1') {
                    left++;
                    j--;
                }

                j = i + 1;
                while (j < n && A.charAt(j) == '1') {
                    right++;
                    j++;
                }
                if (left + right == total) {
                    swap = Math.max(swap, left + right);
                } else {
                    swap = Math.max(swap, left + right + 1);
                }
            }
        }
        return swap;
    }

}
