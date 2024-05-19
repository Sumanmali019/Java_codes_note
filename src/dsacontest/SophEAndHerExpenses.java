package dsacontest;

/*
Problem Description
Sophie is playing a game in which she is given a list, A, consisting of N integers.
She wants to find the absolute difference between the sum of the elements to the left of the current element and the sum of the elements to the right of the current element. If there are no elements on the left or right, their sum will be considered O, i.e., for left extreme element, the left sum will be zero, and for right extreme element, the right sum will be
zero.
Help her in writing a program to find this absolute difference for each element in the list.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 104
Input Format
Only argument A is an integer array.
Output Format
Return an integer array denoting absolute difference for each element in the list.
Example Input
Input 1:
A = [2, 5, 1]
Input 2:
A [1,5 ,3 ,4]

 */
import java.util.Arrays;

public class SophEAndHerExpenses {
    public int[] solvesophie(int[] A) {
        int N = A.length;
        int[] result = new int[N];

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += A[i];
        }

        int leftSum = 0;
        int rightSum = totalSum;

        // Iterate through the array to compute the result
        for (int i = 0; i < N; i++) {
            rightSum -= A[i]; // Remove the current element from rightSum
            result[i] = Math.abs(leftSum - rightSum); // Compute the absolute difference
            leftSum += A[i]; // Add the current element to leftSum
        }

        return result;
    }

    public static void main(String[] args) {

        SophEAndHerExpenses left = new SophEAndHerExpenses();
        int[] A = { 1, 5, 3, 4 };

        int res[] = left.solvesophie(A);

        System.out.println(Arrays.toString(res));
    }

}
