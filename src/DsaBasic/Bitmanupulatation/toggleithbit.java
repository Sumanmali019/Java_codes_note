package DsaBasic.Bitmanupulatation;

/*
 You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
 */

public class toggleithbit {
    public int solve(int A, int B) {

        return ((A ^ (1 << B)));
    }

}
