package DsaBasic.Bitmanupulatation;

/*
 Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 */

public class findingNithmagi {

    public int solve(int A) {

        int power = 5;

        int ans = 0;

        while (A > 0) {
            if ((A & 1) != 0) {
                ans = ans + power;
            }
            A = (A >> 1);
            power = power * 5;
        }
        return ans;
    }

}
