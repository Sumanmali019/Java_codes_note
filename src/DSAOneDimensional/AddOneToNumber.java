package DSAOneDimensional;

/*
 Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */
public class AddOneToNumber {
    public int[] plusOne(int[] A) {
        int n = A.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = A[i] + carry;
            A[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 0) {
            return removeLeadingZeros(A);
        } else {

            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(A, 0, newResult, 1, n);
            return newResult;
        }
    }

    private int[] removeLeadingZeros(int[] array) {
        int start = 0;
        while (start < array.length && array[start] == 0) {
            start++;
        }

        if (start == array.length) {
            return new int[] { 0 };
        }

        int[] result = new int[array.length - start];
        System.arraycopy(array, start, result, 0, array.length - start);
        return result;
    }

}
