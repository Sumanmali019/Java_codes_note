package DsaBasic.DSAbacktracking;

import java.util.ArrayList;
import java.util.Collections;

/*
 Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.
 */
public class Subset {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);

        result.add(new ArrayList<>());
        generate(new ArrayList<>(), 0, N, A);
        return result;
    }

    public void generate(ArrayList<Integer> curr, int idx, int N, ArrayList<Integer> A) {
        if (idx == A.size()) {
            return;
        }
        curr.add(A.get(idx));
        result.add(new ArrayList<>(curr));
        generate(curr, idx + 1, N, A);
        curr.remove(curr.size() - 1);
        while (idx + 1 < A.size() && A.get(idx) == A.get(idx + 1)) {
            idx++;
        }
        generate(curr, idx + 1, N, A);
    }

}
