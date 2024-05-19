package dsacontest;

/*
Construct a binary string having alternate 1's and 0's 
of length A string with 1.

return the decimal value oif that binary string

 */
public class AlternateBiuts {
    public int alternateBits(int a) {

        int num = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                num = (num | 1);
            } else {
                if (i == a) {
                    num = (num << 1);
                } else {
                    num = (num >> 2);
                }
            }

        }
        return num;
    }

    public static void main(String[] args) {
        AlternateBiuts bits = new AlternateBiuts();
        int a = 4;
        int ans = bits.alternateBits(a);
        System.out.println(ans);

    }
}
