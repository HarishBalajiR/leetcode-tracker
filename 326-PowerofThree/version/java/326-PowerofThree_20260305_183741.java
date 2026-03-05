// Last updated: 3/5/2026, 6:37:41 PM
// 1162261467 is the maximum power of 3 in between the given range 2^31, therefore if any powers come before they should divide without remainder then return true else false
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n==0 || n<0) return false;
4        if(1162261467%n==0) return true;
5        return false;
6    }
7}