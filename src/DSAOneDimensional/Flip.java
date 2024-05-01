package DSAOneDimensional;

/*
 You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 */
public class Flip {
    public int[] flip(String A) {

        int maxEndingHere = 0;
        int maxSoFar = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        boolean found = false;

        for (int i = 0; i < A.length(); i++) {
            int num = A.charAt(i) == '0' ? 1 : -1;
            maxEndingHere += num;

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                s = i + 1;
            }

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
                found = true;
            }
        }

        if (!found) {
            return new int[0];
        }

        return new int[] { start + 1, end + 1 };
    }
}
