package DSAinterviewProblem2;

/*
 Given an integer A, find and return the total number of digit 1 appearing in all non-negative integers less than or equal to A.
 */

public class NumberOfDigiotOne {

    public int solve(int A) {
        int base = 1;
        int ans = 0;

        while (base <= A) {
            int left = (A / base) / 10;
            int curr = (A / base) % 10;
            int right = A % base;

            if (curr == 1)
                ans = ans + (left * base + (right + 1));
            else if (curr == 0)
                ans = ans + left * base;
            else
                ans = ans + (left + 1) * base;

            base *= 10;
        }

        return ans;
    }

}
