// Last updated: 2/23/2026, 6:42:05 PM
/*
 * C program to track sumprofit.
 * Sumprofit ---> Whenever profit > 0 add to sumprofit
 * return sumprofit
*/

1int maxProfit(int* prices, int pricesSize) {
2    int sumprofit = 0;
3    for(int index = 1 ; index < pricesSize ; index++){
4        int profit = prices[index] - prices[index-1];
5        if(profit > 0) sumprofit+=profit;
6    }
7    return sumprofit;
8}