// Last updated: 3/11/2026, 4:18:52 PM
/*
 * This is another approach. More optimized than java.
 * Take the remainder and calculate result with it.
 * This reduces the time take to convert to string.
*/

1class Solution {
2public:
3    int bitwiseComplement(int n) {
4        if(n==0) return 1;
5        int result = 0, place = 0;
6        while(n>0){
7            int rem = n%2;
8            if(rem==0){
9                result+=pow(2,place);
10            }
11            place++;
12            n/=2;
13        }
14        return result;
15    }
16};