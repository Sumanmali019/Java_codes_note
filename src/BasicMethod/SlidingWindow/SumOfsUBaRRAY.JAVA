package BasicMethod.SlidingWindow;

/*
 You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 */

public class SumOfSubArray {

    public long subarraySum(int[] A) {

        int a = A.length;
        long total =0;
        
         for (int  i =0; i < a ; i++){
             total += (long) A[i] * ( i + 1) * (a -i);
         }
         return total;
       }

}
