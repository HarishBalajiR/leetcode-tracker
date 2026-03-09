// Last updated: 3/9/2026, 11:37:19 AM
/*
 * Easy Math Question.
 * Do what the statement says.
*/

1class Solution {
2public:
3    int differenceOfSums(int n, int m) {
4        int num1 = 0, num2 = 0;
5        for(int i = 1 ; i <= n ; i++){
6            if(i%m!=0) num1+=i;
7            else num2+=i;
8        }
9        return num1 - num2;
10    }
11};