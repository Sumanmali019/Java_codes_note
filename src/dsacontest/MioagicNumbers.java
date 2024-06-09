package dsacontest;

import DsaBasic.DSArecustion2.MagicSum;

import java.util.*;;

/*
Problem Description:
In a magical world, there is a group of wizards who can cast spells by reciting binary numbers. Each time a wizard recites a binary number, a powerful spell is cast. The more powerful the spell, the larger the binary number recited by the wizard.
The wizards have a tradition of casting spells only on numbers that are divisible by 5. To make their spells more powerful, the wizards want to know the power of the spells they can cast by reciting binary numbers from the most-significant-bit to the least-significant-bit.
Given a binary array nums (O-indexed), we define xi as the number whose binary representation is the subarray A[0..i] (from most-significant-bit to least-significant-bit). For example, if A = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Write a function that returns an array of booleans where answer[i] is true if xi is divisible by 5.
 */

public class MioagicNumbers {
    public int[] solve(int[] A) {

        int n = A.length;
        int[] ans = new int[n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = (num * 2 + A[i]) % 5;

            ans[i] = (num == 0) ? 1 : 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        MioagicNumbers mioagicNumbers = new MioagicNumbers();

        int[] n = { 1, 0, 1, 0, 0 };

        int ans[] = mioagicNumbers.solve(n);

        System.out.println(Arrays.toString(ans));
    }
}
