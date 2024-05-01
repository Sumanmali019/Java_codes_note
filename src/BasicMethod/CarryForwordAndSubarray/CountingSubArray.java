package BasicMethod.CarryForwordAndSubarray;
import java.util.*;;

/*
 Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.
Since the number of subarrays could be large, return value % 109 +7.
 */

public class CountingSubArray {
    public int solve(int[] A) {

        HashSet<Integer> hashset = new HashSet<>();

        int n = A.length;
        int ans = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (hashset.contains(A[right])) {
                hashset.remove(A[left]);
                left++;
            }
            ans += right - left + 1;
            hashset.add(A[right]);
        }
        return (int) (ans % (long) (Math.pow(10, 9) + 7));

    }

}
