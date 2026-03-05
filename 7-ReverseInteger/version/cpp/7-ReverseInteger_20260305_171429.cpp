// Last updated: 3/5/2026, 5:14:29 PM
/*
 * Same approach as Java.
 * Refer Java Notes.
*/

1class Solution {
2public:
3    int reverse(int x) {
4        long rev = 0;
5        int rem = 0;
6    
7        while(x!=0){
8            rem = x%10;
9            rev = rev * 10 + rem;
10            x/=10;
11        }
12        if(rev > INT_MAX || rev < INT_MIN) return 0;
13        return (int)rev;
14    }
15};