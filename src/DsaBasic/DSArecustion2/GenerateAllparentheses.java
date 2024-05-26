package DsaBasic.DSArecustion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Given an integer A pairs of parentheses, 
 write a function to generate all combinations of well-formed parentheses of length 2*A.
 */
public class GenerateAllparentheses {
    public String[] generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, A);
        Collections.sort(result); // Sort the list to ensure the output is sorted
        return result.toArray(new String[0]); // Convert list to array and return

    }

    private void generateParenthesisHelper(ArrayList<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generateParenthesisHelper(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        GenerateAllparentheses solve = new GenerateAllparentheses();
        int a = 3;
        String[] res = solve.generateParenthesis(a);
        System.out.println(Arrays.toString(res));
    }

}
