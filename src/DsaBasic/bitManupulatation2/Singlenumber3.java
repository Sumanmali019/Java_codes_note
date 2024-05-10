package DsaBasic.bitManupulatation2;

/*
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.
 
 */
public class Singlenumber3 {
    public int[] solve(int[] A) {

        int xorAll = 0;

        for (int i = 0; i < A.length; i++) {
            xorAll ^= A[i];
        }

        // find the rigtmost set bit

        int pos = 0;

        for (pos = 0; pos < 32; pos++) {
            if ((xorAll & (1 << pos)) > 0) {
                break;
            }
        }

        int num1 = 0, num2 = 0;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] & (1 << pos)) > 0) {
                num1 ^= A[i];
            } else {
                num2 ^= A[i];
            }
        }
        return new int[] { Math.min(num1, num2), Math.max(num1, num2) };
    }

}