// Last updated: 3/2/2026, 1:59:53 PM
int maxProfit(int* prices, int pricesSize) {
    int sumprofit = 0;
    for(int index = 1 ; index < pricesSize ; index++){
        int profit = prices[index] - prices[index-1];
        if(profit > 0) sumprofit+=profit;
    }
    return sumprofit;
}