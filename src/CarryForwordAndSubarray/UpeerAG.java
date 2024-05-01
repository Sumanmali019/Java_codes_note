package CarryForwordAndSubarray;

/*
 You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 */
public class UpeerAG {

    public long solve(String A) {
        int sum = 0;
        int pair = 0;
        int n = A.length() - 1;

        for (int i = n; i >= 0; i--) {
            int c = A.charAt(i);

            if (c == 'G') {
                pair++;
            } else if (c == 'A') {
                sum += pair;
            }
        }
        return sum;
    }

}
