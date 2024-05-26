package DsaBasic.DSArecurstion;

/*
 Problem Description
Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
 */

public class FindFactional {
    public int solve(int A) {

        if (A == 1) {
            return A;
        }

        return solve(A - 1) * A;

    }

}
