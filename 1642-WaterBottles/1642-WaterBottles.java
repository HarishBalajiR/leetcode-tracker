// Last updated: 3/2/2026, 1:59:01 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles-1)/(numExchange-1);
    }
}