package DsaBasic.Bitmanupulatation;
/* 
Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class checkbit {
    public int check(int A, int B) {

        return ((A & (1 << B)) == 0) ? 0 : 1;

    }

    public static void main(String[] args) {
        checkbit checkbit = new checkbit();

        int A = 5;
        int B = 2;

        int res = checkbit.check(A, B);

        System.out.println(res);
    }
}
