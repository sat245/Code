package Facebook;
// this is O(n^2), but bteere sol exist
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int len = prices.length;
        int[] lis = new int[len];
        for (int i = 0; i < len; i++) {
            int current = i;
            for (int j = 0; j < i; j++) {
                if (prices[j] < prices[current] && (prices[current] - prices[j]) > lis[current]) {
                    lis[current] = prices[current] - prices[j];
                }
            }
        }
        int max = -1;
        for (int i = 0; i < len; i++) {
            if (lis[i] > max) max = lis[i];
        }
        return max;
    }
}
