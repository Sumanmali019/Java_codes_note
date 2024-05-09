package DsaBasic.bitManupulatation2;

public class Maximumandpair {
    public int solve(int[] A) {

        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        int n = A.length;

        for (int i = 0; i < n; i++) {
            // int count = 0;
            for (int j = i + 1; j < n; j++) {
                sum = A[i] & A[j];
                maxValue = Math.max(sum, maxValue);
            }

        }
        return maxValue;
    }

    public static void main(String[] args) {
        Maximumandpair maximumandpair = new Maximumandpair();

        int[] A = { 38, 44, 84, 12 };

        int res = maximumandpair.solve(A);

        System.out.println(res);

    }
}
