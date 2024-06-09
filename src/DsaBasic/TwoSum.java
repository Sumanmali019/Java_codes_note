package DsaBasic;

import java.util.*;

public class TwoSum {

    public int[] twosum(int[] a, int b) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int com = b - a[i];

            if (set.containsKey(com)) {
                return new int[] { set.get(com), i };
            }
            set.put(a[i], i);

        }
        return null;

    }

}
