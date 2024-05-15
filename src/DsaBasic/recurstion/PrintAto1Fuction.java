package DsaBasic.recurstion;

/*
 Problem Description
You are given an integer A, print A to 1 using using recursion.
Note :- After printing all the numbers from A to 1, print a new line.
 */

public class PrintAto1Fuction {
    public void solve(int A) {
        rec(A);
        System.out.println();
    }
    int rec(int A) {
        if (A < 1) {
            return 1;
        }
        System.out.print(A + " ");
        return rec(A - 1);
    }
}
