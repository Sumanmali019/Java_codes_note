package DsaBasic.Bitmanupulatation;

/*
 * 
 * Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
 */

public class number1bit {

    public int numSetBits(int N) {
        int count = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                count++;
            }

            N = (N >> 1);
        }
        return count;
    }

    public static void main(String[] args) {
        number1bit inter = new number1bit();
        int A = 11;
        int res = inter.numSetBits(A);
        System.out.println(res);
    }
}
