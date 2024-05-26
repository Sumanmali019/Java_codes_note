package DsaBasic.DSArecustion2;

/*
Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 */

public class KthSymbol {
    public int solution(int A, int B) {

        if (B == 0) {
            return 0;
        }

        int val = solution(A - 1, B / 2);

        if (val == 0) {
            if ((B & 1) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if ((B & 1) == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        KthSymbol kthSymbol = new KthSymbol();
        int a = 4;
        int b = 4;
        int sum = kthSymbol.solution(a, b);
        System.out.println(sum);
    }

}
