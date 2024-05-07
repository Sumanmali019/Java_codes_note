package DsaBasic.Bitmanupulatation;

/*
 You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class bitset {
    public int solve(int A, int B) {

        return (1 << A) | (1 << B);
    }

    public static void main(String[] args) {
        bitset setbit = new bitset();
        int a = 3;
        int b = 5;
        int res = setbit.solve(a, b);
        System.out.println(res);
    }
}
