package DsaBasic.bitManupulatation2;
/*
 Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.

Since the answer can be large, return the remainder after the dividing the answer by 109+7.
 */

public class SumXorAll {
    public int solve(int[] A) {

        long ans = 0;
        for (int i = 0; i < 32; i++) {
            long setBit = 0;
            long unsetBit = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) != 0) {
                    setBit++;
                } else {
                    unsetBit++;
                }
            }
            ans = (ans + (setBit * unsetBit) * (1 << i));
        }
        return (int) (ans % 1000000007);
    }

}
