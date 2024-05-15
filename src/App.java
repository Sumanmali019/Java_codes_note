class App {
    public static long pairWithMaxSum(long arr[], long N) {

        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < N - 1; i++) {
            long currentSum = arr[i] + arr[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        long[] arr = { 10, 4, 5, 7, 6, 10, 6 };
        long N = arr.length;
        System.out.println(pairWithMaxSum(arr, N));
    }
}
