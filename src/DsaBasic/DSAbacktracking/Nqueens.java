package DsaBasic.DSAbacktracking;

import java.util.ArrayList;
import java.util.Arrays;

/*

The N-queens puzzle is the problem of placing N queens on an N×N chessboard 
such that no two queens attack each other.
Given an integer A denoting the value of N, return all distinct solutions to the N-queens puzzle.

Each solution contains a distinct board configuration of the N-queens' placement, where 'Q' and '.' both indicate a queen and an empty 
space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.


 */
public class Nqueens {
    public ArrayList<ArrayList<String>> solveNQueens(int A) {

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int[] rows = new int[A];
        Arrays.fill(rows, -1);
        System.out.println(Arrays.toString(rows));

        generateNQueens(0, rows, ans, A);
        return ans;
    }

    public boolean isAttacking(int x1, int y1, int x2, int y2) {
        return (x1 == x2 || y1 == y2 || (x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2));
    }

    public boolean isValid(int x, int y, int[] rows) {
        for (int i = 0; i < x; i++) {
            if (isAttacking(x, y, i, rows[i]))
                return false;
        }
        return true;
    }

    public ArrayList<String> generateSolution(int[] rows) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            StringBuilder curr = new StringBuilder();
            for (int j = 0; j < rows.length; j++) {
                if (rows[i] == j)
                    curr.append('Q');
                else
                    curr.append(" [] ");
            }
            ans.add(curr.toString());
        }
        return ans;
    }

    public void generateNQueens(int row, int[] rows, ArrayList<ArrayList<String>> ans, int n) {
        if (row == n) {
            ans.add(generateSolution(rows));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, rows)) {
                rows[row] = col;
                generateNQueens(row + 1, rows, ans, n);
                rows[row] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Nqueens solve = new Nqueens();
        int a = 4;

        ArrayList<ArrayList<String>> abs = solve.solveNQueens(a);

        System.out.println(abs);
    }
}
