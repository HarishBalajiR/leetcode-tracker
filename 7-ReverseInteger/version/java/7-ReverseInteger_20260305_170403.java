// Last updated: 3/5/2026, 5:04:03 PM
/*
 * Basic Reversing the Integer using num%10 and while loop.
 * One simple integer overflow check and thats it.
 * Easiest medium problem.
*/

1class Solution {
2    public int reverse(int x) {
3        long rev = 0 , rem = 0;
4        int sign = 1;
5        if(x < 0) sign = -1;
6        x = Math.abs(x);
7        while(x!=0){
8            rem = x%10;
9            rev = rev*10 + rem;
10            x/=10;
11        }
12        if(rev > Math.pow(2,31) - 1 || rev < Math.pow(2,-31)) return 0;
13        return (int)rev*sign;
14    }
15}