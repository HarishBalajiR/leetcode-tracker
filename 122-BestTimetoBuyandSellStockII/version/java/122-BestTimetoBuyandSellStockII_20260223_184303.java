// Last updated: 2/23/2026, 6:43:03 PM
/*
 * Track sumprofit.
 * Whenever profit > 0 add to sumprofit
 * return sumprofit
*/

1class Solution {
2    public int maxProfit(int[] prices) {
3        int sumprofit = 0;
4        int n = prices.length;
5        for(int i = 1 ; i < n ; i++){
6            int profit = prices[i] - prices[i-1];
7            if(profit>0) sumprofit+=profit;
8        }
9        return sumprofit;
10    }
11}