package DsaBasic.DSArecurstion;
/*

Problem Description
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward. 

*/

public class CheckPalindrone {
    public int solve(String A) {
        if (A.length() <= 1)
            return 1;
        if (A.charAt(0) == A.charAt(A.length() - 1)) {
            return solve(A.substring(1, A.length() - 1));
        }
        return 0;
    }
}
