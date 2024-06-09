package DsaBasic;

import java.util.*;

public class PrimeToN {
    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 1; i <= A; i++) {
            if (IsPrime(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    boolean IsPrime(int A) {

        if (A <= 1) {
            return false;
        }
        if (A <= 3) {
            return false;
        }
        if (A % 2 == 0 || A % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= A; i++) {
            if (A % i == 0 || A % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        PrimeToN primeToN = new PrimeToN();
        int a = 47;

        ArrayList<Integer> ans = primeToN.solve(a);

        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

}