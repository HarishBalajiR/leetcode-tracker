// Last updated: 3/2/2026, 1:59:47 PM
class Solution {
    public int maxProfit(int[] prices) {
        int sumprofit = 0;
        int n = prices.length;
        for(int i = 1 ; i < n ; i++){
            int profit = prices[i] - prices[i-1];
            if(profit>0) sumprofit+=profit;
        }
        return sumprofit;
    }
}