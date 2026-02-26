// Last updated: 2/26/2026, 6:08:29 PM
/*
 * Water Bottles.
 * Formula:
 * Total Bottles + (Series of full bottles)/(Series of Empty Bottles)
*/

1int numWaterBottles(int numBottles, int numExchange) {
2    return numBottles + (numBottles-1)/(numExchange-1);
3}