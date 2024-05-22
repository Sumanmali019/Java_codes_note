package dsacontest;
/*
Problem Description
You are given an array of N integers A. You are also given Q queries given the array B. For every query B[i], you need to find the count of pairs from the array A such that the bitwise AND of them has the B[i]-th bit set i.e. 1 (a bit is considered "set" when it has a value of 1).
Note: It is guaranteed that the answer will fit in 32 bits
 */

public class Benjaminand {
    public int[] solve(int[] A, int[] B) {

        // Store counts of how many numbers have each bit set
        int[] bitCount = new int[32];

        // Precompute bit counts for each number
        for (int num : A) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        // Result array to store answers for each query
        int[] result = new int[B.length];

        // Process each query
        for (int q = 0; q < B.length; q++) {
            int bitIndex = B[q];
            if (bitIndex < 0 || bitIndex >= 32) {
                result[q] = 0;
                continue;
            }

            // Get the count of numbers that have the bitIndex-th bit set
            int count = bitCount[bitIndex];

            // Calculate the number of pairs (n choose 2)
            if (count > 1) {
                result[q] = count * (count - 1) / 2;
            } else {
                result[q] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Benjaminand sol = new Benjaminand();
        int[] A = { 2, 5, 6, 7 };
        int[] B = { 1, 2 };
        int[] results = sol.solve(A, B);
        System.out.println(java.util.Arrays.toString(results)); // Should print [3, 3]
    }

}
