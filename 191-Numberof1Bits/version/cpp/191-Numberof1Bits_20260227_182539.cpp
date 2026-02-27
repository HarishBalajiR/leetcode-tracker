// Last updated: 2/27/2026, 6:25:39 PM
/*
 * Counting using While loop
 * Binary digits -> num%2
 * Learning C++ - 2nd
*/

1class Solution {
2public:
3    int hammingWeight(int n) {
4        int count = 0;
5        while(n!=0){
6            int bin = n%2;
7            if(bin==1) count++;
8            n/=2;
9        }
10        return count;
11    }
12};