package BasicMethod.SlidingWindow;

/*
 Given an array A of size N, find the subarray of size B with the least average.
 */
public class SubArrayWithLeastAvg {
    public int solve(int[] A, int B) {

        int a = A.length;

        int sum = 0;
        int average = 0;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int min_index = sum;

        for (int i = B; i < a; i++) {
            sum += A[i] - A[i - B];

            if (sum < min_index) {
                min_index = sum;
                average = i - B + 1;
            }
        }
        return average;

    }
}
