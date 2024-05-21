package DsaBasic.recustion2;
/*
 On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 */

public class KthSyblolHrad {
    public int solve(int A, Long B) {
        if (A == 1 && B == 0) {
            return 0;
        }

        int val = solve((A - 1), B / 2);

        if (B % 2 == 0) {
            return val;
        }
        return 1 - val;
    }

    public static void main(String[] args) {
        KthSyblolHrad KthSyblolHrad = new KthSyblolHrad();
        int a = 4;
        Long b = 4L;
        int sum = KthSyblolHrad.solve(a, b);
        System.out.println(sum);
    }
}
