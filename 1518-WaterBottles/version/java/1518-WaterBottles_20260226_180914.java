// Last updated: 2/26/2026, 6:09:14 PM
1class Solution {
2    public int numWaterBottles(int numBottles, int numExchange) {
3        return numBottles + (numBottles-1)/(numExchange-1);
4    }
5}