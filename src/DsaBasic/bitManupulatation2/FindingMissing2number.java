package DsaBasic.bitManupulatation2;

import java.util.Arrays;

/*
Given an array A of length N where all the elements are distinct and are in the range [1, N+2].

Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
 */
public class FindingMissing2number {
    public int[] solve(int[] A) {
        int n = A.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = temp ^ A[i];
        }
        for (int i = 1; i <= n + 2; i++) {
            temp = temp ^ i;
        }
        int pos = -1;
        for (int i = 0; i < 31; i++) {
            if ((temp & (1 << i)) != 0) {
                pos = i;
                break;
            }
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if ((A[i] & (1 << pos)) != 0) {
                a = a ^ A[i];
            } else {
                b = b ^ A[i];
            }
        }

        for (int i = 1; i <= n + 2; i++) {
            if ((i & (1 << pos)) != 0) {
                a = a ^ i;
            } else {
                b = b ^ i;
            }
        }
        int Arr[] = new int[2];
        Arr[0] = a;
        Arr[1] = b;
        Arrays.sort(Arr);
        return Arr;
    }
}
