package DsaBasic.Bitmanupulatation;

/*
 Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class Unsetithbit {
    public int unset(int A, int B) {
        if ((A & (1 << B)) == 0) {
            return A;
        }

        return A ^ (1 << B);
    }

    public static void main(String[] args) {
        Unsetithbit unsetithbit = new Unsetithbit();

        int A = 4;
        int B = 1;

        int res = unsetithbit.unset(A, B);

        System.out.println(res);

    }
}
