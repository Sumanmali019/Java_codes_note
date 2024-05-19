import java.util.*;

/*
 Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target. 
 You may assume that each input would have exactly one solution, 
 and you may not use the same element twice. 
 You can return the answer in any order.

input: nums = [2, 7, 11, 15], target = 9
Expected Output: [0, 1]

*/
class App {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int output = 0;
        int sum = 0;
        int max = 0;

        for (int i = satisfaction.length - 1; i >= 0; i--) {
            output += satisfaction[i] + sum;
            sum += satisfaction[i];
            max = Math.max(output, max);
        }
        return max;
    }

    public static void main(String[] args) {
        App app = new App();
        int[] a = { 4, 3, 2 };
        int ans = app.maxSatisfaction(a);

        System.out.println((ans));
    }

}
