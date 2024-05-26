package DsaBasic.DSAbacktracking;
/*
 Given a matrix of integers A of size N x M . There are 4 types of squares in it:

1. 1 represents the starting square.  There is exactly one starting square.
2. 2 represents the ending square.  There is exactly one ending square.
3. 0 represents empty squares we can walk over.
4. -1 represents obstacles that we cannot walk over.
Find and return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.
 */

import java.util.ArrayList;

public class Unique {
    int ans = 0;

    public int solve(ArrayList<ArrayList<Integer>> A) {

        int N = A.size();
        int M = A.get(0).size();
        int count = 0;
        int starti = -1;
        int startj = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A.get(i).get(j) == 0)
                    count++;
                else if (A.get(i).get(j) == 1) {
                    starti = i;
                    startj = j;
                }
            }
        }

        ArrayList<Integer> curr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> visited = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                temp.add(0);
            }
            visited.add(temp);
        }

        ans = 0;
        generate(A, curr, count, starti, startj, N, M, visited);

        return ans;
    }

    public void generate(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> curr, int count,
            int i, int j, int N, int M, ArrayList<ArrayList<Integer>> visited) {

        int val = A.get(i).get(j);

        if (val == 0) {
            curr.add(val);
        } else if (val == -1) {
            return;
        } else if (val == 2) {
            if (curr.size() == count) {
                ans++;
                return;
            } else {
                return;
            }
        }

        visited.get(i).set(j, 1);

        if (i + 1 < N && visited.get(i + 1).get(j) == 0) {
            generate(A, curr, count, i + 1, j, N, M, visited);
        }

        if (i - 1 >= 0 && visited.get(i - 1).get(j) == 0) {
            generate(A, curr, count, i - 1, j, N, M, visited);
        }

        if (j + 1 < M && visited.get(i).get(j + 1) == 0) {
            generate(A, curr, count, i, j + 1, N, M, visited);
        }

        if (j - 1 >= 0 && visited.get(i).get(j - 1) == 0) {
            generate(A, curr, count, i, j - 1, N, M, visited);
        }

        if (val == 0) {
            curr.remove(curr.size() - 1);
        }

        visited.get(i).set(j, 0);

    }
}
