package DSAinterviewProblem;

import java.util.*;

/*
 Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */

public class ColourFulNumber {
    public int colorful(int A) {
        ArrayList<Integer> newarr = new ArrayList<>();

        while (A != 0) {
            int tmep = A % 10;
            newarr.add(tmep);
            A = A / 10;
        }

        HashSet<Integer> setvalue = new HashSet<>();

        int n = newarr.size();

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= newarr.get(j);
                if (setvalue.contains(product)) {
                    return 0;
                } else {
                    setvalue.add(product);
                }
            }
        }
        return 1;
    }

}
