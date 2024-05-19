package dsacontest;

import java.util.Arrays;

/*
Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice. Find the two integers that appear only once.
Note: Return the two numbers in ascending order.
Problem Constraints
 */
public class SingleNumber {
    public int[] solve(int[] A) {

        int xor = 0;

        for (int nums : A) {
            xor ^= nums;
        }

        int rightmost = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        for (int num : A) {
            if ((num & rightmost) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        if (num1 > num2) {
            return new int[] { num2, num1 };
        } else {
            return new int[] { num1, num2 };
        }
    }

    public static void main(String[] args) {

        SingleNumber number1 = new SingleNumber();

        int[] a = { 1, 2, 3, 1, 2, 4 };

        int[] b = number1.solve(a);

        System.out.println(Arrays.toString(b));
    }

}
