package DsaBasic.DSAbacktracking;

import java.util.ArrayList;

/*
 Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
 */
public class Permutation {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        boolean[] visit = new boolean[A.size()]; // initializing visited[] array
        for (int i = 0; i < A.size(); i++)
            visit[i] = false;
        ArrayList<Integer> res = new ArrayList<>();
        perm(A, 0, visit, res);

        return ans;

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    void perm(ArrayList<Integer> A, int idx, boolean[] visit, ArrayList<Integer> res) {
        if (idx == A.size()) // BASE CASE
        {
            ans.add(new ArrayList(res));
            return;

        }

        for (int i = 0; i < A.size(); i++) {
            if (visit[i] == false) {
                visit[i] = true;
                res.add(idx, A.get(i));
                perm(A, idx + 1, visit, res);
                res.remove(res.size() - 1); // state restoration
                visit[i] = false; // state restoration

            }
        }

    }

}
