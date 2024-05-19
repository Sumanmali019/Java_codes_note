package dsacontest;

/*
Once upon a time, there was a library which had a shelf of books that was initially sorted in non-decreasing order based on the book's titles. One day, the librarian decided to rearrange the books by rotating the shelf some number of positions (including zero). Now, she wants to know if the order of the books has been changed or not. Can you help the librarian by writing a function that returns 1 if the shelf was originally sorted in non-decreasing and then rotated to current order and O otherwise?
Note: An array A rotated by x positions results in an array B of the same length such that A[i]
B[(i+x) % A.length], where % is the modulo operation.
Problem Constraints
1 <= A.size() <=
1 <= A[i] <= 109
105
Input Format
First argument is an integer array A.
Output Format
Return an integer denoting 1 if the array can be rotated to form a non decreasing array.
Example Input
Input 1:
A = [3, 4, 1, 2]
Input 2:
A =[2, 1, 9, 9]
 
 */
public class Librarianandrotation {

    public int solveme(int[] A) {
        int n = A.length;
        int disruptionCount = 0;
        int disruptionIndex = -1;

        // Identify the number of disruptions
        for (int i = 0; i < n; i++) {
            if (A[i] > A[(i + 1) % n]) {
                disruptionCount++;
                disruptionIndex = i;
            }
        }

        // If there is more than one disruption, it can't be sorted by rotation
        if (disruptionCount > 1) {
            return 0;
        }

        // If there is no disruption, the array is already sorted
        if (disruptionCount == 0) {
            return 1;
        }

        // There is exactly one disruption, so let's check if rotation works
        // Check if rotating at (disruptionIndex + 1) results in a sorted array
        int rotationPoint = (disruptionIndex + 1) % n;
        for (int i = 1; i < n; i++) {
            if (A[(rotationPoint + i) % n] < A[(rotationPoint + i - 1) % n]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Librarianandrotation point = new Librarianandrotation();

        int[] A = { 7, 10 };

        int res = point.solveme(A);

        System.out.println(res);
    }

}
