package DsaBasic.DSAmaths2;

import java.util.*;

/*

Write a program to print the pascal triangle up to A rows.
 */

public class PacalsTriangle {
    public ArrayList<ArrayList<Integer>> solveme(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    row1.add(1);
                } else {
                    int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    row1.add(val);
                }

            }
            ans.add(row1);
        }

        return ans;

    }

    public static void main(String[] args) {
        PacalsTriangle nPacalsTriangle = new PacalsTriangle();
        int ans = 5;
        ArrayList<ArrayList<Integer>> keep = nPacalsTriangle.solveme(ans);
        System.out.println(keep);

    }

}
