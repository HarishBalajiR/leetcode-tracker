// Last updated: 3/9/2026, 11:51:44 AM
/*
 * There are three cases.
 * If num%3 == 1 -> We can subtract 1 from it to make it divisible by 3 and op++;
 * Eg : 7
 * If num%3 == 2 -> We can add 1 to it to make it divisible by 3 and op++;
 * Eg : 5
 * IF num%3 ==0 -> No need
 * return op
*/

1class Solution {
2public:
3    int minimumOperations(vector<int>& nums) {
4        int op = 0;
5        for(int num : nums) if(num%3!=0) op++;
6        return op;
7    }
8};