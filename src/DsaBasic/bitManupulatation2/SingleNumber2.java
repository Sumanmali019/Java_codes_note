package DsaBasic.bitManupulatation2;

/*
Given an array of integers, every element appears thrice except for one, which occurs once.
Find that element that does not appear thrice.
NOTE: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?
 */

public class SingleNumber2 {
    public int singlenumbertwo(int[] A) {
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) > 0) {
                    count++;
                }
            }

            if (count % 3 == 1) {
                sum = (sum | (1 << i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SingleNumber2 singleNumber2 = new SingleNumber2();

        int[] a = {0, 0, 0, 1 };

        int ans = singleNumber2.singlenumbertwo(a);

        System.err.println(ans);
    }

}
