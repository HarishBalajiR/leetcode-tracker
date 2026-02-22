// Last updated: 2/22/2026, 9:17:24 PM
/*
 * Two Pointers Basics/Sliding Window Basics.
 * Basically buy on min day and sell on max day. 
 * left to track the min day/buy day.
 * right to track the max profit day/sell day.
 * left = right is correct and not left++ because what if the max profit day was later than 1 day.
 * maxprofit to track max profit.
*/

1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int left = 0 , right = 1;
5        int maxprofit = 0;
6        while(right < n){
7            int total = prices[right] - prices[left];
8            if(total < 0){
9                left = right;
10                continue;
11            }
12            maxprofit = Math.max(maxprofit,total);
13            right++;
14        }
15        return maxprofit;
16    }
17}