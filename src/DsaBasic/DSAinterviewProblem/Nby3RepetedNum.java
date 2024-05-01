package DsaBasic.DSAinterviewProblem;

/*
 You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem
 */
public class Nby3RepetedNum {

    public int repeatedNumber(int[] A) {

        int n = A.length;
        int max_index1 = 0;
        int max_index2 = 0;

        int max_count1 = 0;
        int max_count2 = 0;

        for (int i = 1; i < n; i++) {
            int index = A[i];
            if (index == max_index1) {
                max_count1--;
            } else if (index == max_count2) {
                max_count2++;
            } else if (max_count1 == 0) {
                max_index1 = index;
                max_count1 = 1;
            } else if (max_count2 == 0) {
                max_index2 = index;
                max_count2 = 1;
            } else {
                max_count1--;
                max_count2--;
            }
        }
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == max_index1) {
                count1++;
            } else if (A[i] == max_index2) {
                count2++;
            }
        }
        if (count1 > n / 3) {
            return max_index1;
        } else if (count2 > n / 3) {
            return max_index2;
        }
        return -1;
    }

}
