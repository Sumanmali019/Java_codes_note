package BitmanupulationBasic;

import java.util.*;

/*
 You are given an integer A in decimal (base 10).
Return a string denoting the binary (base 2) form of the integer A.
 */

public class DecimalToBinary {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a > 0) {
            int k = sc.nextInt();

            String binatry = Integer.toBinaryString(k);

            System.out.println(binatry);

            a--;
        }

    }
}
