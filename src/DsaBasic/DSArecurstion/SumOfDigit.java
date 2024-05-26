package DsaBasic.DSArecurstion;

/*
Given a number A, we need to find the sum of its digits using recursion. 
 */
public class SumOfDigit {
    public int solve(int A) {
        if (A == 0) {
            return 0;
        }
        return A % 10 + solve(A / 10);
    }

    public static void main(String[] args) {
        int a = 46;
        SumOfDigit sumOfDigit = new SumOfDigit();
        int res = sumOfDigit.solve(a);
        System.out.println(res);
    }
}
