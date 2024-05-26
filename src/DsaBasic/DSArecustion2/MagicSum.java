package DsaBasic.DSArecustion2;
/*

Given a number A, check if it is a magic number or not.
A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition.
If the single digit comes out to be 1, then the number is a magic number.
 
*/

public class MagicSum {
    public int sum(int A) {
        int calsum = calculated(A);
        if (calsum == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int calculated(int A) {
        if (A < 10) {
            return A;
        } else {
            int sum = 0;
            while (A > 0) {
                sum += A % 10;
                A /= 10;

            }
            return calculated(sum);
        }
    }

    public static void main(String[] args) {
        MagicSum sum = new MagicSum();
        int a = 83557;
        int res = sum.sum(a);
        System.out.println(res);

    }

}
