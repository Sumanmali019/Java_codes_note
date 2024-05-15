package DsaBasic.recurstion;

/*
 Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 */

public class ImplementPowerFraction {

    public int pow(int A, int B, int C) {
        if (A == 0) {
            return 0;
        }
        if (B == 0 && A != 0) {
            return 1;
        }
        long ans = (pow(A, B / 2, C) + C) % C;
        if (B % 2 == 0) {
            return (int) ((ans * ans) % C);
        } else {
            return (int) ((((ans * ans) % C * (A) % C) % C + C) % C);
        }
    }

}
