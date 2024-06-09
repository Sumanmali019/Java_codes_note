package DsaBasic;

import java.util.*;;
/*
 Given an array arr, replace every 
 element in that array with the greatest 
 element among the elements to its right, 
 and replace the last element with -1.
 After doing so, return the array.
 */

public class ReplaceElement {
    public int[] replaceElements(int[] arr) {

        int rightmax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int max = Math.max(rightmax, arr[i]);
            arr[i] = rightmax;
            rightmax = max;

        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElement replaceElement = new ReplaceElement();
        int[] a = { 17, 18, 5, 4, 6, 1 };
        int[] ans = replaceElement.replaceElements(a);
        System.out.println(Arrays.toString(ans));
    }
}
