// Last updated: 3/9/2026, 11:45:56 AM
/*
 * This can be done in O(1) using AP Formulas.
 * But i am not in 12th anymore to remember that.
*/

1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1 = 0, num2 = 0;
4        for(int i = 1 ; i <= n ; i++){
5            if(i%m!=0) num1+=i;
6            else num2+=i;
7        }
8        return num1-num2;
9    }
10}