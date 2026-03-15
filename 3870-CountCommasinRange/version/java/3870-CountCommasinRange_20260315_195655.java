// Last updated: 3/15/2026, 7:56:55 PM
// literally approach is so simple
1class Solution {
2    public int countCommas(int n) {
3        if(n<1000) return 0;
4        else return n - 999;
5    }
6}