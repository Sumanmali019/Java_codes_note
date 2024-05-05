package DsaBasic.DSATwoDinmention;
/*
 Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, 
 compute how much water it is able to trap after raining.
 */

public class RainWater {
    public int trap(final int[] A) {

        int a = A.length;

        int total = 0;

        // leftmax

        int[] leftmax = new int[a];
        leftmax[0] = A[0];

        for (int i = 1; i < a; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], A[i]);
        }

        // rightmax
        int[] rightmax = new int[a];
        rightmax[a - 1] = A[a - 1];

        for (int i = a - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], A[i]);
        }

        for (int i = 0; i < a; i++) {
            int h = Math.min(leftmax[i], rightmax[i]);
            int water = (h - A[i] * 1);
            total += water;
        }
        return total;
    }
}
