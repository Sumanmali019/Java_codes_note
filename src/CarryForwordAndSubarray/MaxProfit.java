package CarryForwordAndSubarray;
/*
 Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 */

public class MaxProfit {
    public int maxProfit(final int[] A) {

        int a = A.length;
        if (a == 0) {
            return 0;
        }

        int min_profit = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            min_profit = Math.min(min_profit, A[i]);
            max_profit = Math.max(max_profit, A[i] - min_profit);
        }
        return max_profit;
    }

}
