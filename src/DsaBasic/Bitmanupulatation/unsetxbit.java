package DsaBasic.Bitmanupulatation;

/*
 Problem Description
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.
 */
public class unsetxbit {
    public long solve(long A, int B) {

        A = ( A << B);
        A = ( A >> B);

        return A;
    }

}
