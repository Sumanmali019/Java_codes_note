package dsacontest;

/*
Given an array of N postive integers represting the weighjts of the ingredients in the dish
Find the maximum possible sum i if a subarray with decreasing weight


Input = arr [10,5,4,3,2,1,3,1];
outpurt = 25
*/
public class DecresingDish {
    public int maxSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxSum = 0;
        int currentSum = arr[0];
        int previousSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < previousSum) {
                currentSum += arr[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = arr[i];
            }
            previousSum = arr[i];
        }
        maxSum = Math.max(maxSum, currentSum);
        return maxSum;
    }

    public static void main(String[] args) {
        DecresingDish decresingDish = new DecresingDish();
        int[] arr = { 10, 5, 4, 3
            , 2, 1, 3, 1 };
        int res = decresingDish.maxSum(arr);
        System.out.println(res);
    }
}
