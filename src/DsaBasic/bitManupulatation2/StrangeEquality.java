package DsaBasic.bitManupulatation2;

/*
Given an integer A.
Two numbers, X and Y, are defined as follows:

X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.
 */
public class StrangeEquality {

    public int solve(int A) {
        int ans = 0;
        int i = 0;

        while ((A >> i) != 0) {
            if (((1 << i) & A) == 0) {
                ans = ans | (1 << i);
            }
            i++;
        }
        return ans ^ ((int) Math.pow(2, i));
    }

    public static void main(String[] args) {
        StrangeEquality equality = new StrangeEquality();
        int a = 20;
        int res = equality.solve(a);
        System.out.println(res);

    }

}
