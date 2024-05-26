package DsaBasic.DSArecurstion;

/*
Problem Description
You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.
 */

public class Print1toA {
    public void increating(int a) {

        if (a == 0) {
            return;
        }
        increating(a - 1);
        System.out.print(a + " ");

    }

    public void solve(int A) {
        increating(A);
        System.out.println();
    }

}
