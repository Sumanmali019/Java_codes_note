package DsaBasic.bitManupulatation2;

public class Maximumandpair {
    public int solve(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 31; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (checkBits(A[j], i)) {
                    count = count + 1;
                }
            }

            if (count >= 2) {
                ans = ans + (1 << i);
                for (int j = 0; j < n; j++) {
                    if (!checkBits(A[j], i)) {
                        A[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

    public boolean checkBits(int num, int pos) {
        return ((num >> pos) & 1) == 1;
    }
}
