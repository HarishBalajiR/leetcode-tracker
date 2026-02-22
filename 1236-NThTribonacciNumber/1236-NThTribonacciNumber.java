// Last updated: 2/22/2026, 1:54:43 PM
class Solution {
    public int tribonacci(int n) {
        int a = 0,b = 1,c = 1,d = 0;
        while(n-->0){
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}