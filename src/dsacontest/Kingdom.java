package dsacontest;

/*
 ﻿

Once upon a time, in a kingdom far far away, there was a wise king who loved mathematics. One day, he gave a task to his court mathematician.
The task was to find the complement of an integer. The court mathematician knew that the complement of an integer is the integer you get when you flip all the O's to 1's and all the 1's to O's in its binary representation (till most significant bit). Court mathematician couldn't solve the task, Can you help him in finding the complement of given Integer A.
Note: While taking complement you have to flip the bits till most significant bit of the given number.
 */
public class Kingdom {
    public int solve(int A) {
        // Base case when the input is 0, the complement of 0 is all bits set to 1 up to
        // the most significant bit.
        if (A == 0) {
            return 1; // Assuming we treat the smallest integer as having at least one significant
                      // bit.
        }

        // Calculate the number of bits in the binary representation of A
        int numBits = (int) (Math.floor(Math.log(A) / Math.log(2))) + 1;

        // Create a mask with all bits set to 1 at positions less than numBits
        int mask = (1 << numBits) - 1;

        // Return the complement of A
        return A ^ mask;
    }

    public static void main(String[] args) {
        Kingdom sol = new Kingdom();
        int A = 5; // For example, binary of 5 is 101, complement will be 010 which is 2.
        System.out.println("The complement of " + A + " is: " + sol.solve(A));
    }

}
