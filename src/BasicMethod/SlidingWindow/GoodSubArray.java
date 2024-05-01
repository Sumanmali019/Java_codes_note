package BasicMethod.SlidingWindow;
/*
 Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
 */

public class GoodSubArray {
    public int solve(int[] A, int B) {

        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < n; j++) {
                sum += A[j];

                int length = j - i + 1;

                if (length % 2 == 0 && sum < B || length % 2 != 0 && sum > B) {
                    count++;
                }
            }
        }
        return count;

    }

}
