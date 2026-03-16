// Last updated: 3/16/2026, 8:21:20 AM
class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        else return n - 999;
    }
}