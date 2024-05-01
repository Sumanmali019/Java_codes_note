package DSAinterviewProblem2;
/*
 Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:

The replacement must be in-place, do not allocate extra memory.
DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
 */

public class NextPermutaion {
    public int[] nextPermutation(int[] A) {

        int n = A.length;

        int i = n - 2;

        while (i >= 0 && A[i] >= A[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            while (j >= 0 && A[j] < A[i]) {
                j--;
            }
            swap(A, i, j);
        }
        reverse(A, i + 1);
        return A;
    }

    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void reverse(int A[], int start) {
        int end = A.length - 1;

        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

}
