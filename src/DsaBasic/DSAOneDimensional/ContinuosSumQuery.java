package DsaBasic.DSAOneDimensional;

import java.util.Arrays;

/*
* There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
* Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
* For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
 */

public class ContinuosSumQuery {

    public int[] sumQurey(int A, int[][] B) {
        int[] newarr = new int[A];
        int n = B.length;

        for (int i = 0; i < n; i++) {
            int start = B[i][0] - 1;
            int end = B[i][1];
            int value = B[i][2];

            newarr[start] += value;

            if (end < A) {
                newarr[end] -= value;
            }
        }
        for (int i = 1; i < A; i++) {
            newarr[i] += newarr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args) {
        ContinuosSumQuery conti = new ContinuosSumQuery();
        int A = 5;
        int[][] B = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };
        int[] arr = conti.sumQurey(A, B);
        System.out.println(Arrays.toString(arr));

    }

}
