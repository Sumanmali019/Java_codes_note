package DsaBasic.DSAbacktracking;

import java.util.ArrayList;

/*
Given a set of distinct integers A, 
return all possible subsets that can be formed from the elements of array A.
 */
public class AllpossibleSubset {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(0, A, new ArrayList<>(), result);
        return result;

    }

    public static void backtrack(int index, ArrayList<Integer> A,
            ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (index == A.size()) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(A.get(index));
        backtrack(index + 1, A, temp, res);
        temp.remove(temp.size() - 1);
        backtrack(index + 1, A, temp, res);
    }

}
