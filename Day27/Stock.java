package Day27;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max =0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n;i++) {
           int profit = prices[i] - min;
           if(prices[i]<min) {
                min = prices[i];
           }
           else {
                max = Math.max(profit,max);
           }
        }
        return max;
    }
}