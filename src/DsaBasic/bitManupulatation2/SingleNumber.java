package DsaBasic.bitManupulatation2;

/*
 Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int single(final int[] A) {

        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) > 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                sum = sum | (1 << i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SingleNumber singleNumbe = new SingleNumber();
        int[] A = { 1, 2, 2 };

        int result = singleNumbe.single(A);
        System.out.println(result);

    }
}
