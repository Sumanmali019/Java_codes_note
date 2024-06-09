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
    public int maxSatisfaction(int A, int B, int C) {
        if (A == 0) {
            return 0;
        }
        

        if (B == 0 && A != 0) {
            return 1;
        }

        long ans = (maxSatisfaction(A, B / 2, C) + C) % C;
        if (B % 2 == 0) {
            return (int) ((ans * ans) % C);
        } else {
            return (int) ((((ans * ans) % C * (A) % C) % C + C) % C);
        }

    }

    public static void main(String[] args) {
        App maxSatisfaction = new App();
        int A = -1;
        int B = 1;
        int C = 20;
        int i = maxSatisfaction.maxSatisfaction(A, B, C);

        System.out.println(i);
    }
}
